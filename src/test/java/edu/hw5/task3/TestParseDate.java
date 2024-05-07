package edu.hw5.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParseDate {
    @Test
    void testParseDate() {
        assertEquals(Optional.of(LocalDate.now().minusDays(10)), new ParseDate().parseDate("10 days ago"));
        assertEquals(Optional.of(LocalDate.now().minusDays(1)), new ParseDate().parseDate("1 day ago"));
        assertEquals(Optional.of(LocalDate.now().minusDays(1)), new ParseDate().parseDate("yesterday"));
        assertEquals(Optional.of(LocalDate.now()), new ParseDate().parseDate("today"));
        assertEquals(Optional.of(LocalDate.now().plusDays(1)), new ParseDate().parseDate("tomorrow"));
        assertEquals(Optional.of(LocalDate.of(2020, 3, 1)), new ParseDate().parseDate("1/3/20"));
        assertEquals(Optional.of(LocalDate.of(1976, 3, 1)), new ParseDate().parseDate("1/3/1976"));
        assertEquals(Optional.of(LocalDate.of(2020, 3, 1)), new ParseDate().parseDate("1/3/20"));
        assertEquals(Optional.of(LocalDate.of(2020, 12, 2)), new ParseDate().parseDate("2020-12-2"));
        assertEquals(Optional.of(LocalDate.of(2020, 10, 10)), new ParseDate().parseDate("2020-10-10"));
        assertEquals(Optional.empty(), new ParseDate().parseDate("2020-10-1011"));
    }
}
