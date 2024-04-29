package edu.hw2.task3.connectionManager;

import edu.hw2.task3.connection.Connection;
import edu.hw2.task3.connection.FaultyConnection;
import edu.hw2.task3.connection.StableConnection;
import java.util.Random;

public class DefaultConnectionManager implements ConnectionManager {
    @Override
    public Connection getConnection() {
        return new Random().nextBoolean() ? new StableConnection() : new FaultyConnection();
    }
}
