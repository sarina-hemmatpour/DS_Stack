package com.company;

public class SinglyLinkedList <E>{


    //node
    private static class Node<E>{

        private E element;
        private Node<E> next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }


    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {

        this.head=null;
        this.tail=null;
        this.size=0;

    }


    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size==0);
    }

    public E first()
    {
        if (isEmpty())
        {
            return null;
        }

        return head.getElement();
    }

    public E last()
    {
        if (isEmpty())
        {
            return null;
        }

        return tail.getElement();
    }

    public void addFirst(E element)
    {
        Node<E> newNode=new Node<>(element , head);

        head=newNode;

        if (size==0)
        {
            tail=head;
        }

        size++;
    }

    public void addLast(E element)
    {
        Node<E> newNode=new Node<>(element,null);
        if (size==0)
        {
            head=newNode;
        }
        else
        {
            tail.next=newNode;
        }
        tail=newNode;
        size++;
    }

    public E removeFirst()
    {
        if (isEmpty())
        {
            return null;
        }
        E el=head.element;
        if (size==1)
        {

            head=null;
            tail=null;
            size--;
            return el;
        }

        size--;
        head=head.next;
        return el;
    }

}
