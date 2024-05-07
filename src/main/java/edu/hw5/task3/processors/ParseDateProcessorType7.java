package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDateProcessorType7 extends ParseDateProcessor {
    ParseDateProcessorType7() {
        super(new ParseDateProcessorType6());
    }

    @Override
    public LocalDate parseDate(String date) {
        Pattern pattern = Pattern.compile("^yesterday$");
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
