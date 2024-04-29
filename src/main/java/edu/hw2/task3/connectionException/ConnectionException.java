package edu.hw2.task3.connectionException;

public class ConnectionException extends RuntimeException {
    public ConnectionException(String connectionException, ConnectionException e) {
        super(connectionException, e);
    }

    public ConnectionException() {
    }
}
