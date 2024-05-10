package edu.hw6.task6;

import java.util.Objects;

@SuppressWarnings("NeedBraces")
public record Port(int value, Type type, String title) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Port port)) return false;
        return value == port.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    enum Type {
        TCP,
        UDP
    }
}
