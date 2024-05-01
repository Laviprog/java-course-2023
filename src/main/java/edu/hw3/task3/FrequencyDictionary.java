package edu.hw3.task3;

import java.util.HashMap;

public class FrequencyDictionary {
    public HashMap<Object, Integer> freqDict(Object[] elements) {
        HashMap<Object, Integer> freqDict = new HashMap<>();
        for (Object object : elements) {
            freqDict.put(object, freqDict.getOrDefault(object, 0) + 1);
        }
        return freqDict;
    }
}
