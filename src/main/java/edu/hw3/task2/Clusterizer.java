package edu.hw3.task2;

import java.util.ArrayList;
import java.util.List;

public class Clusterizer {
    public String[] clusterize(String string) {
        List<String> list = new ArrayList<>();
        int balance = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                balance++;
            } else if (string.charAt(i) == ')') {
                balance--;
            }
            sb.append(string.charAt(i));
            if (balance == 0) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return list.toArray(String[]::new);
    }
}
