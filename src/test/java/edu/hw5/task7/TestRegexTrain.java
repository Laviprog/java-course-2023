package edu.hw5.task7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRegexTrain {
    @ParameterizedTest
    @CsvSource({
            "000, true",
            "00, false",
            "111, false",
            "1101, true",
            "0010, false",
            "120, false"
    })
    void testTrain1(String str, boolean expected) {
        assertEquals(expected, new RegexTrain().train1(str));
    }

    @ParameterizedTest
    @CsvSource({
            "101, true",
            "11, true",
            "1, true",
            "000, true",
            "00, true",
            "0, true",
            "10111110, false",
            "011101, false"
    })
    void testTrain2(String str, boolean expected) {
        assertEquals(expected, new RegexTrain().train2(str));
    }

    @ParameterizedTest
    @CsvSource({
            ", false",
            "2, false",
            "23, false",
            "1, true",
            "000, true",
            "1010, false",
            "101, true",
            "11, true",
            "210, false"
    })
    void testTrain3(String str, boolean expected) {
        assertEquals(expected, new RegexTrain().train3(str == null ? "" : str));
    }
}
