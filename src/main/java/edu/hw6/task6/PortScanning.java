package edu.hw6.task6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class PortScanning {
    private static final Logger LOGGER = LogManager.getLogger(PortScanning.class);

    public static final int NUMBER_PORTS = 49151;

    public List<Port> scan() {
        List<Port> ports = new ArrayList<>();
        for (int port = 0; port <= NUMBER_PORTS; port++) {
            try {
                ServerSocket serverSocket = new ServerSocket(port);
                serverSocket.close();
            } catch (IOException e) {
                ports.add(new Port(port, Port.Type.TCP, new PortDescriptionUtils().getPortDescription(port)));
            }
            try {
                DatagramSocket datagramSocket = new DatagramSocket(port);
                datagramSocket.close();
            } catch (IOException e) {
                ports.add(new Port(port, Port.Type.UDP, new PortDescriptionUtils().getPortDescription(port)));
            }
        }
        return ports;
    }

    public void print(List<Port> ports) {
        LOGGER.info(String.format("%-10s %-8s %s%n", "Протокол", "Порт", "Сервис"));
        ports.forEach(port -> LOGGER.info(
                        String.format(
                                "%-10s %-8d %s%n",
                                port.type().toString(),
                                port.value(),
                                port.title()
                        )
                )
        );
    }
}
