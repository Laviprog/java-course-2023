package edu.hw3.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContacts {
    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new String[]{"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"},
                        "ASC",
                        new Contact[]{
                                new Contact("Thomas Aquinas"),
                                new Contact("Rene Descartes"),
                                new Contact("David Hume"),
                                new Contact("John Locke")
                        }
                ),
                Arguments.of(
                        new String[]{"Paul Erdos", "Leonhard Euler", "Carl Gauss"},
                        "DESC",
                        new Contact[]{
                                new Contact("Carl Gauss"),
                                new Contact("Leonhard Euler"),
                                new Contact("Paul Erdos")
                        }
                ),
                Arguments.of(
                        new String[]{},
                        "DESC",
                        new Contact[]{}
                ),
                Arguments.of(
                        null,
                        "DESC",
                        new Contact[]{}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testContacts(String[] input, String sortedType, Contact[] expected) {
        assertArrayEquals(expected, new Contacts().parseContacts(input, sortedType));
    }
}
