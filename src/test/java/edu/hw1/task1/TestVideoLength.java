package edu.hw1.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestVideoLength {
    @ParameterizedTest
    @CsvSource({
        "01:00, 60",
        "13:56, 836",
        "10:60, -1",
        "999:59, 59999"
    })
    void test(String timeString, int ans) {
        assertEquals(ans, new VideoLength().minutesToSeconds(timeString));
    }
}
