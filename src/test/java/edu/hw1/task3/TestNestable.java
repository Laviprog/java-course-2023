package edu.hw1.task3;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNestable {
    private static Stream<Arguments> lists() {
        return Stream.of(
            Arguments.of(new int[] {1, 2, 3, 4}, new int[] {0, 6}, true),
            Arguments.of(new int[] {3, 1}, new int[] {4, 0}, true),
            Arguments.of(new int[] {9, 9, 8}, new int[] {8, 9}, false),
            Arguments.of(new int[] {1, 2, 3, 4}, new int[] {2, 3}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("lists")
    void test(int[] mas1, int[] mas2, boolean ans) {
        assertEquals(ans, new Nestable().isNestable(mas1, mas2));
    }
}
