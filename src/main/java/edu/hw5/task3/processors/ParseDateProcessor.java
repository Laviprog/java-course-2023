package edu.hw5.task3.processors;

import java.time.LocalDate;

public abstract class ParseDateProcessor {
    ParseDateProcessor nextProcessor;

    ParseDateProcessor(ParseDateProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract LocalDate parseDate(String date);
}
