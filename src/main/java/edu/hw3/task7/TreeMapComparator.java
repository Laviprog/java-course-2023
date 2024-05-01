package edu.hw3.task7;

import java.util.Comparator;

public class TreeMapComparator implements Comparator<Comparable<Object>> {
    @Override
    public int compare(Comparable<Object> o1, Comparable<Object> o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.compareTo(o2);
    }

    public static <T> Comparator<T> getInstance() {
        return (Comparator<T>) new TreeMapComparator();
    }
}
