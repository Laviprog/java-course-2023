package edu.hw5.task8;

import java.util.regex.Pattern;

public class RegexTrain2 {
    // odd length
    private static final Pattern PATTERN1 = Pattern.compile("^[0-1]([0-1]{2})*$");
    // start 0 and odd length or start 1 and even length
    private static final Pattern PATTERN2 = Pattern.compile("(^0([0-1]{2})*$)|(^1[01]([01]{2})*$)");
    // any string except 11 and 111
    private static final Pattern PATTERN3 = Pattern.compile("^(?!11$|111$)([01]+)?$");
    // every odd symbol is 1
    private static final Pattern PATTERN4 = Pattern.compile("^([01]1)*[01]?$");
    // not serial symbols 1
    private static final Pattern PATTERN5 = Pattern.compile("^(?![01]*11)[01]+$");

    public boolean train1(String str) {
        return PATTERN1.matcher(str).find();
    }

    public boolean train2(String str) {
        return PATTERN2.matcher(str).find();
    }

    public boolean train3(String str) {
        return PATTERN3.matcher(str).find();
    }

    public boolean train4(String str) {
        return PATTERN4.matcher(str).find();
    }

    public boolean train5(String str) {
        return PATTERN5.matcher(str).find();
    }
}
