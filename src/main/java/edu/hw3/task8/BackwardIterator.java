package edu.hw3.task8;

import java.util.Collection;
import java.util.Iterator;

public class BackwardIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;

    public BackwardIterator(Collection<T> collection) {
        iterator = collection.stream().toList().reversed().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }
}
