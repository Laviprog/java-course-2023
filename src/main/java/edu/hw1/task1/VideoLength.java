package edu.hw1.task1;

public class VideoLength {
    private final static int SECONDS_PER_MINUTE = 60;

    public int minutesToSeconds(String minutes) {
        String[] split = minutes.split(":");
        if (Integer.parseInt(split[1]) >= SECONDS_PER_MINUTE) {
            return -1;
        }
        return Integer.parseInt(split[0]) * SECONDS_PER_MINUTE + Integer.parseInt(split[1]);
    }
}
