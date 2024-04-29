package edu.hw1.task3;

public class Nestable {

    public boolean isNestable(int[] a, int[] b) {
        return min(a) > min(b) && max(a) < max(b);
    }

    private int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    private int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        return min;
    }
}
