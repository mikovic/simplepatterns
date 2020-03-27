package main.java.mikovic.com;

import main.java.mikovic.com.interfaces.Array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArrayImpl<E extends Object & Comparable<? super E>> implements Array<E> {

    private static final int INITIAL_CAPACITY = 16;

    protected E[] data;
    protected int currentSize;

    public ArrayImpl() {
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayImpl(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }


    public void add(E value) {
        if (currentSize == data.length) {
            data = grow();
        }
        data[currentSize++] = value;
    }

    protected E[] grow() {
        return Arrays.copyOf(data, data.length * 2);
    }


    public E get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IllegalArgumentException("Invalid index value");
        }
        return data[index];
    }


    public boolean remove(E value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }

        data[currentSize - 1] = null;
        currentSize--;

        return true;
    }


    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    public int indexOf(E value) {
        for (int i = 0; i < currentSize; i++) {
            if (value.equals(data[i])) {
                return i;
            }
        }

        return -1;
    }


    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }



    @Override
    public String toString() {
        return Stream.of(data)
                .limit(currentSize)
//                .map(element -> String.valueOf(element))
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));


    }
}
