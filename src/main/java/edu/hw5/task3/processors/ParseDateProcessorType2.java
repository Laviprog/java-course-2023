package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParseDateProcessorType2 extends ParseDateProcessor {
    ParseDateProcessorType2() {
        super(new ParseDateProcessorType1());
    }

    @Override
    public LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-d"));
        } catch (DateTimeParseException e) {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
