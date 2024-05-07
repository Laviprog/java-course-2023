package edu.hw5.task8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRegexTrain2 {
    @ParameterizedTest
    @CsvSource({
            "11, false",
            "111, true",
            "211, false",
            "0, true",
            "1, true",
            "3, false",
            "11001, true"
    })
    void testTrain1(String str, boolean expected) {
        assertEquals(expected, new RegexTrain2().train1(str));
    }

    @ParameterizedTest
    @CsvSource({
            "111, false",
            "11, true",
            "011, true",
            "0, true",
            "100, false",
            "003, false",
            "1100, true",
            "010001, false",
            "1002, false"
    })
    void testTrain2(String str, boolean expected) {
        assertEquals(expected, new RegexTrain2().train2(str));
    }

    @ParameterizedTest
    @CsvSource({
            "11, false",
            "111, false",
            "2, false",
            "1, true",
            "1100101, true",
            "1111, true",
            "1928, false",
            "0, true",
            ", true"
    })
    void testTrain3(String str, boolean expected) {
        assertEquals(expected, new RegexTrain2().train3(str == null ? "" : str));
    }

    @ParameterizedTest
    @CsvSource({
            "11, true",
            "111, true",
            "211, false",
            "0, true",
            "1, true",
            "3, false",
            "11001, false",
            "010101011111, true",
            "010100, false"
    })
    void testTrain4(String str, boolean expected) {
        assertEquals(expected, new RegexTrain2().train4(str));
    }

    @ParameterizedTest
    @CsvSource({
            "11, false",
            "111, false",
            "211, false",
            "0, true",
            "1, true",
            "3, false",
            "11001, false",
            "100000100001, true",
            "0101010, true",
            "1011, false"
    })
    void testTrain5(String str, boolean expected) {
        assertEquals(expected, new RegexTrain2().train5(str));
    }
}
