package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDateProcessorType8 extends ParseDateProcessor {
    ParseDateProcessorType8() {
        super(new ParseDateProcessorType7());
    }

    @Override
    public LocalDate parseDate(String date) {
        Pattern pattern = Pattern.compile("^1 day ago$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            return LocalDate.now().minusDays(1);
        } else {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
