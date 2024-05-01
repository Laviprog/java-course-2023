package edu.hw3.task7;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTreeMapComparator {
    @Test
    void testComparator() {
        TreeMap<Integer,String> treeMap = new TreeMap<>(TreeMapComparator.getInstance());
        treeMap.put(null, "1");
        assertTrue(treeMap.containsKey(null));
    }
}
