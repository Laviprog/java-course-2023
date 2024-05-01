package edu.hw3.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBackwardIterator {
    @Test
    void test() {
        BackwardIterator<Integer> backwardIterator = new BackwardIterator<>(List.of(1, 2, 3));
        List<Integer> list = new ArrayList<>();
        while (backwardIterator.hasNext()){
            list.add(backwardIterator.next());
        }
        assertEquals(list, List.of(3, 2, 1));
    }
}
