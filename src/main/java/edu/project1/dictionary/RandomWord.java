package edu.project1.dictionary;

import java.util.Random;

@SuppressWarnings("MagicNumber")
public class RandomWord {
    private static final String[] WORDS = {"apple", "pencil", "hand", "random"};

    public String getRandomWord() {
        return WORDS[new Random().nextInt(0, 1000) % WORDS.length];
    }
}
