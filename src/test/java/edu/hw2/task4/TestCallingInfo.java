package edu.hw2.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCallingInfo {
    @Test
    void testCallingInfo() {
        assertEquals(
                new CallingInfo(
                        "edu.hw2.task4.TestCallingInfo",
                        "testCallingInfo"
                ),
                CallingInfo.callingInfo()
        );
    }
}
