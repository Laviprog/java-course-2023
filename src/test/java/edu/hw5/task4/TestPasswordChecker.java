package edu.hw5.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordChecker {
    @ParameterizedTest
    @CsvSource({
            "dshfhsd!, true",
            "hdsfdsfg, false",
            "@dd, true",
            "**jshsdf, true",
            "y3728yw7834grwebue, false"
    })
    void testPasswordChecker(String password, boolean expected) {
        assertEquals(expected, new PasswordChecker().checkPassword(password));
    }
}
