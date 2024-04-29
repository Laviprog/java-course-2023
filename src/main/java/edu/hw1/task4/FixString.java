package edu.hw1.task4;

public class FixString {

    public String fixString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            sb.append(str.charAt(i + 1)).append(str.charAt(i));
        }
        if (str.length() % 2 == 1) {
            sb.append(str.charAt(str.length() - 1));
        }
        return sb.toString();
    }
}
