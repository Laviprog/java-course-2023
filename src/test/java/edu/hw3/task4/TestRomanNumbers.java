package edu.hw3.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumbers {
    static Stream<Arguments> decimalToRomanTestArguments() {
        return Stream.of(
                Arguments.of(2, "II"),
                Arguments.of(12, "XII"),
                Arguments.of(16, "XVI"),
                Arguments.of(156, "CLVI"),
                Arguments.of(765, "DCCLXV")
        );
    }

    @ParameterizedTest
    @MethodSource("decimalToRomanTestArguments")
    void convertDecimalToRomanTest(int number, String expected) {
        assertEquals(new RomanNumbers().convertToRoman(number), expected);
    }
}
