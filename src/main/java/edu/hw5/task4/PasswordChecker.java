package edu.hw5.task4;

import java.util.regex.Pattern;

public class PasswordChecker {
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("[~!@#$%^&*|]");

    public boolean checkPassword(String password) {
        return PASSWORD_PATTERN.matcher(password).find();
    }
}
