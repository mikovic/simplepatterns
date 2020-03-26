package main.java.mikovic.com.interfaces;

public interface Array<E> {
    void add(E value);
    E get(int index);
    boolean remove(E value);
    boolean contains(E value);
    int indexOf(E value);
    int getSize();
    boolean isEmpty();

}
