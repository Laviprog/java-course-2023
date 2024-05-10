package edu.hw6.task6;

public class PortScanningApplication {
    private PortScanningApplication() {
    }

    public static void run() {
        PortScanning portScanning = new PortScanning();
        portScanning.print(portScanning.scan());
    }
}
