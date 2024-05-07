package edu.hw5.task3;

import edu.hw5.task3.processors.ParseDateProcessorType9;
import java.time.LocalDate;
import java.util.Optional;

public class ParseDate {
    public Optional<LocalDate> parseDate(String date) {
        return Optional.ofNullable(new ParseDateProcessorType9().parseDate(date));
    }
}
