package ru.otus.homework03;

import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int index = 0;
    private T[] elements;

    public ArrayIterator(T[] elements) {
        this.elements = elements;
    }


    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public T next() {
        return elements[index++];
    }
}
