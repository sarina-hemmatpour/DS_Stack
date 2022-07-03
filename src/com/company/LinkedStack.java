package com.company;

public class LinkedStack<E> implements Stack<E> {

    private SinglyLinkedList<E> list=new SinglyLinkedList<>();


    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void push(E element) {

        list.addFirst(element);
    }
}
