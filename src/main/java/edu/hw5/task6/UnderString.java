package edu.hw5.task6;

import java.util.regex.Pattern;

public class UnderString {
    public boolean isUnderString(String str, String sub) {
        return Pattern.compile(sub).matcher(str).find();
    }
}
