package edu.hw3.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrequencyDictionary {
    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new Integer[]{1, 2, 3},
                        new HashMap<Integer, Integer>(){{
                            put(1, 1);
                            put(2, 1);
                            put(3, 1);
                        }}
                ),
                Arguments.of(
                        new String[]{"a", "bb", "a", "bb"},
                        new HashMap<>(){{
                            put("a", 2);
                            put("bb", 2);
                        }}
                ),
                Arguments.of(
                        new String[]{"this", "and", "that", "and"},
                        new HashMap<>(){{
                            put("this", 1);
                            put("and", 2);
                            put("that", 1);
                        }}
                ),
                Arguments.of(
                        new String[]{"код", "код", "код", "bug"},
                        new HashMap<>(){{
                            put("код", 3);
                            put("bug", 1);
                        }}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFrequencyDictionary(Object[] input, HashMap<Object, Integer> expected) {
        assertEquals(expected, new FrequencyDictionary().freqDict(input));

    }
}
