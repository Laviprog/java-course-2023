package edu.hw5.task1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AverageSession {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
    private static final int SECONDS_PER_MINUTE = 60;

    public String averageSession(List<String> sessions) {
        long summaryTimeSession = 0;
        for (String session : sessions) {
            String[] sessionData = session.split(" - ");
            LocalDateTime startTime = LocalDateTime.parse(sessionData[0], FORMATTER);
            LocalDateTime endTime = LocalDateTime.parse(sessionData[1], FORMATTER);
            summaryTimeSession += Duration.between(startTime, endTime).toMinutes();
        }
        long averageTimeSession = summaryTimeSession / sessions.size();
        return averageTimeSession / SECONDS_PER_MINUTE + "ч " + averageTimeSession % SECONDS_PER_MINUTE + "м";
    }
}
