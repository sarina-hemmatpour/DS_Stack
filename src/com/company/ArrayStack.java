package com.company;

public class ArrayStack<E> implements Stack<E>{

    public static final int defultSize=1000;
    private E[ ] array;
    private int  lastIndex;


    public ArrayStack( ) {
        array=(E[]) new Object[defultSize];
        lastIndex=-1;
    }


    public ArrayStack(int size) {
        array=(E[ ]) new Object[size];
        lastIndex=-1;
    }



    @Override
    public E pop() {
        if (isEmpty())
        {
            return null;
        }

        E el=top();

        array[lastIndex]=null;
        lastIndex--;

        return el;
    }

    @Override
    public int size() {
        return lastIndex++;
    }

    @Override
    public boolean isEmpty() {
        return lastIndex==-1;
    }

    @Override
    public E top() {
        return array[lastIndex];
    }

    @Override
    public void push(E element) throws IllegalStateException {
        if (array.length==(lastIndex+1))
        {
            throw new IllegalStateException("Stack is full");
        }

        lastIndex++;
        array[lastIndex]=element;

    }

}

