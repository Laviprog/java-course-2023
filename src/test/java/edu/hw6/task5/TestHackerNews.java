package edu.hw6.task5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHackerNews {
    @Test
    public void testHackerNews() {
        System.out.println(Arrays.toString(new HackerNews().hackerNewsTopStories()));
        String newsTitle = new HackerNews().news(37570037);
        assertEquals("JDK 21 Release Notes", newsTitle);
    }
}
