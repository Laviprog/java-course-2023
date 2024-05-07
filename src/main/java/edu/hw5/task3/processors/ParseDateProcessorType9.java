package edu.hw5.task3.processors;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDateProcessorType9 extends ParseDateProcessor {
    public ParseDateProcessorType9() {
        super(new ParseDateProcessorType8());
    }

    @Override
    public LocalDate parseDate(String date) {
        Pattern pattern = Pattern.compile("^([1-9]\\d+) days ago$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            return LocalDate.now().minusDays(Integer.parseInt(matcher.group(1)));
        } else {
            if (nextProcessor != null) {
                return nextProcessor.parseDate(date);
            } else {
                return null;
            }
        }
    }
}
