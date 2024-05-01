package edu.hw3.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestClusterizer {
    static Stream<Arguments> method() {
        return Stream.of(
                Arguments.of("()()()", new String[]{"()", "()", "()"}),
                Arguments.of("((()))", new String[]{"((()))"}),
                Arguments.of("((()))(())()()(()())", new String[]{"((()))", "(())", "()", "()", "(()())"}),
                Arguments.of("((())())(()(()()))", new String[]{"((())())", "(()(()()))"})
        );
    }

    @ParameterizedTest
    @MethodSource("method")
    void testClusterizer(String string, String[] expected) {
        assertArrayEquals(expected, new Clusterizer().clusterize(string));
    }
}
