package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParseDateProcessorType1 extends ParseDateProcessor {
    ParseDateProcessorType1() {
        super(null);
    }

    @Override
    public LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
