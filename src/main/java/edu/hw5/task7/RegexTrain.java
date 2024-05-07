package edu.hw5.task7;

import java.util.regex.Pattern;

public class RegexTrain {
    private static final Pattern PATTERN1 = Pattern.compile("^[01]{2}0[01]*");
    private static final Pattern PATTERN2 = Pattern.compile("(^1[0-1]*1$)|(^0[0-1]*0$)|^0$|^1$");
    private static final Pattern PATTERN3 = Pattern.compile("^[0-1][0-1]?[0-1]?$");

    public boolean train1(String line) {
        return PATTERN1.matcher(line).find();
    }

    public boolean train2(String line) {
        return PATTERN2.matcher(line).find();
    }

    public boolean train3(String line) {
        return PATTERN3.matcher(line).find();
    }
}
