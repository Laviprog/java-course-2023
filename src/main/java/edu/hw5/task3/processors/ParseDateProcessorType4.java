package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParseDateProcessorType4 extends ParseDateProcessor {
    ParseDateProcessorType4() {
        super(new ParseDateProcessorType3());
    }

    @Override
    public LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("d/M/yy"));
        } catch (DateTimeParseException e) {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
