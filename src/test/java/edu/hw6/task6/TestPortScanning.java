package edu.hw6.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestPortScanning {
    @Test
    void test(){
        PortScanning portScanning = new PortScanning();
        var res = portScanning.scan();
        assertFalse(res.isEmpty());
        portScanning.print(res);
    }
}
