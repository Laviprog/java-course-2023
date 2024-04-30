package edu.hw1.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCountDigits {
    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "5666, 4",
        "544, 3",
        "1092328, 7"
    })
    void test(int number, int ans) {
        assertEquals(ans, new CountDigit().countDigit(number));
    }
}
