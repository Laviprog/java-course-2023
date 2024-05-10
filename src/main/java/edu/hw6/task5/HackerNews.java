package edu.hw6.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerNews {
    private static final String ENDPOINT_URI = "https://hacker-news.firebaseio.com/v0";
    private static final String NEWS_TOP_STORIES = "/topstories.json";
    private static final String NEWS_NUMBER = "/item/%d.json";
    private static final Pattern PATTERN_GET_TITLE = Pattern.compile("\"title\":\"([^\"]+)\"");
    private static final Logger LOGGER = LogManager.getLogger(HackerNews.class);

    public long[] hackerNewsTopStories() {
        try {
            String[] strings = Objects.requireNonNull(sendRequest(ENDPOINT_URI + NEWS_TOP_STORIES)).split("[,\\[\\]]");
            return Arrays.stream(strings).filter(x -> !x.isEmpty()).mapToLong(Long::parseLong).toArray();
        } catch (NullPointerException e) {
            LOGGER.error("HackerNews: NullPointerException");
            return new long[0];
        }
    }

    private String sendRequest(String uri) {
        try (HttpClient client = HttpClient.newBuilder().build()) {
            HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(uri)).build();
            return client.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException | InterruptedException e) {
            LOGGER.error("HackerNews error", e);
            return null;
        }
    }

    public String news(long id) {
        return parseNewsTitle(sendRequest(ENDPOINT_URI + NEWS_NUMBER.formatted(id)));
    }

    private String parseNewsTitle(String s) {
        Matcher matcher = PATTERN_GET_TITLE.matcher(s);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
