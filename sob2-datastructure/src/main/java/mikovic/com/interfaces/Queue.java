package main.java.mikovic.com.interfaces;
public interface Queue<E> {

    void insert(E value);
    E remove();
    E peek();
    boolean isEmpty();
    boolean isFull();
    int getSize();

}
