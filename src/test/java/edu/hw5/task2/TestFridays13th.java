package edu.hw5.task2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFridays13th {
    @Test
    void testFridays13() {
        assertEquals(List.of(
                        LocalDate.parse("1925-02-13"),
                        LocalDate.parse("1925-03-13"),
                        LocalDate.parse("1925-11-13")
                ),
                new Fridays13th().fridays13th(1925)
        );
        assertEquals(List.of(
                        LocalDate.parse("2024-09-13"),
                        LocalDate.parse("2024-12-13")
                ),
                new Fridays13th().fridays13th(2024)
        );
    }

    @Test
    void testNextFriday() {
        assertEquals(
                LocalDate.parse("2024-12-13"),
                new Fridays13th().nextFriday(LocalDate.parse("2024-09-13")
                )
        );
        assertEquals(
                LocalDate.parse("2024-09-13"),
                new Fridays13th().nextFriday(LocalDate.parse("2024-01-01")
                )
        );
    }
}
