package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDateProcessorType6 extends ParseDateProcessor {
    ParseDateProcessorType6() {
        super(new ParseDateProcessorType5());
    }

    @Override
    public LocalDate parseDate(String date) {
        Pattern pattern = Pattern.compile("^today$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            return LocalDate.now();
        } else {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
