package edu.hw3.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAtbash {
    @ParameterizedTest
    @CsvSource({
            "a, z",
            "A, Z",
            "1, 1",
            "Hello world!, Svool dliow!",
            "Any fool can write code that a computer can understand. " +
                    "Good programmers write code that humans can understand." +
                    " ― Martin Fowler, Zmb ullo xzm dirgv xlwv gszg z " +
                    "xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv " +
                    "gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi"
    })
    void testAtbash(String string, String expected) {
        assertEquals(expected, new Atbash().atbash(string));
    }
}
