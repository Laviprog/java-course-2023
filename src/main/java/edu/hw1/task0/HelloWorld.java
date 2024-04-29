package edu.hw1.task0;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private final static Logger LOGGER = LogManager.getLogger("HelloWorld");

    public void helloWorld() {
        LOGGER.info("Hello World!");
    }
}
