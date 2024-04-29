package edu.hw1.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestKaprekar {
    @ParameterizedTest
    @CsvSource({
        "3524, 3",
        "6621, 5",
        "6554, 4",
        "1234, 3",
        "6174, 0"
    })
    void test(int num, int ans) {
        assertEquals(ans, new Kaprekar().countK(num));
    }
}
