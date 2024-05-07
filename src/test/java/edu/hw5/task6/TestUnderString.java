package edu.hw5.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnderString {
    @ParameterizedTest
    @CsvSource({
            "achfdbaabgabcaabg, abc, true",
            "aaaabaaaa, abaaaa, true",
            "urrrik, ura, false",
            "urrrik, a, false",
            "achfdbaabgabcaabg, abc, true"
    })
    void testUnderString(String str, String sub, boolean expected) {
        assertEquals(expected, new UnderString().isUnderString(str, sub));
    }
}
