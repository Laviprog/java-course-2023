package edu.hw1.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFixString {
    @ParameterizedTest
    @CsvSource({
        "123456, 214365",
        "hTsii  s aimex dpus rtni.g, This is a mixed up string.",
        "badce, abcde",
        "abacaba, bacabaa",
        "a, a",
        "aba, baa",
        "baba, abab"
    })
    void test(String str, String ans) {
        assertEquals(ans, new FixString().fixString(str));
    }
}
