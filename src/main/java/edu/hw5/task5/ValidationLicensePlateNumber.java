package edu.hw5.task5;

import java.util.regex.Pattern;

public class ValidationLicensePlateNumber {
    private static final Pattern PATTERN = Pattern.compile("^[АВЕКМНОРСТУХ](\\d{3})[АВЕКМНОРСТУХ]{2}(\\d{2})(\\d?)$");

    public boolean isValid(String licensePlateNumber) {
        return PATTERN.matcher(licensePlateNumber).find();
    }
}
