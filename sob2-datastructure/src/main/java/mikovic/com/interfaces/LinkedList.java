package main.java.mikovic.com.interfaces;

import main.java.mikovic.com.SimpleLinkedListImpl;

public interface LinkedList<E> extends Iterable<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    void display();

    boolean isEmpty();

    int getSize();

    boolean contains(E value);

    E getFirstElement();

    SimpleLinkedListImpl.Entry<E> getFirst();

}
