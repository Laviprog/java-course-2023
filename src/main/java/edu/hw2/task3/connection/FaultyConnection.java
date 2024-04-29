package edu.hw2.task3.connection;

import edu.hw2.task3.connectionException.ConnectionException;
import java.util.Random;

public class FaultyConnection implements Connection {
    @Override
    public void execute(String command) throws ConnectionException {
        if (new Random().nextBoolean()) {
            throw new ConnectionException();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
