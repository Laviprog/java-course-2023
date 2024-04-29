package edu.hw2.task3.commands;

import edu.hw2.task3.connection.Connection;
import edu.hw2.task3.connectionException.ConnectionException;
import edu.hw2.task3.connectionManager.ConnectionManager;

public class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() throws Exception {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) throws Exception {
        int attempts = 0;
        while (attempts < maxAttempts) {
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                break;
            } catch (ConnectionException e) {
                if (++attempts == maxAttempts) {
                    throw new ConnectionException("Connection Exception", e);
                }
            }
        }
    }

}
