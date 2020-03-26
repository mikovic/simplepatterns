package main.java.mikovic.com;

import main.java.mikovic.com.interfaces.Array;
import main.java.mikovic.com.interfaces.LinkedList;

public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new ArrayImpl<>();
        array.add(2);
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(3);
        System.out.println(array);
        array.remove(5);
        System.out.println(array);
        System.out.println( array.contains(5));
        System.out.println( array.get(2));

        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        SimpleLinkedListImpl.Entry<Integer> current = linkedList.getFirst();
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        linkedList.removeFirst();
        linkedList.removeFirst();
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        linkedList.remove(10);
        linkedList.display();
        System.out.println(linkedList.isEmpty());










    }

}
