package edu.hw1.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPalindrome {
    @ParameterizedTest
    @CsvSource({
        "11211230, true",
        "13001120, true",
        "23336014, true",
        "425765276, false"
    })
    void test(long num, boolean ans) {
        assertEquals(ans, new Palindrome().isPalindromeDescendant(num));
    }
}
