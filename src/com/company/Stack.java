package com.company;

public interface Stack<E> {

    E pop();
    int size();
    boolean isEmpty();
    E top();
    void push(E element);

}
