package edu.hw1.task7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCycleShift {
    @DisplayName("TestRotateRight")
    @ParameterizedTest
    @CsvSource({
        "8, 1, 4",
        "128, 10, 32",
        "54, 7, 27"
    })
    void TestRotateRight(int n, int shift, int ans) {
        assertEquals(ans, new CycleShift().rotateRight(n, shift));
    }

    @DisplayName("TestRotateLeft")
    @ParameterizedTest
    @CsvSource({
        "16, 1, 1",
        "17, 2, 6",
        "67, 30, 14"
    })
    void TestRotateLeft(int n, int shift, int ans) {
        assertEquals(ans, new CycleShift().rotateLeft(n, shift));
    }
}
