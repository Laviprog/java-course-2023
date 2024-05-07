package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDateProcessorType5 extends ParseDateProcessor {
    ParseDateProcessorType5() {
        super(new ParseDateProcessorType4());
    }

    @Override
    public LocalDate parseDate(String date) {
        Pattern pattern = Pattern.compile("^tomorrow$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            return LocalDate.now().plusDays(1);
        } else {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
