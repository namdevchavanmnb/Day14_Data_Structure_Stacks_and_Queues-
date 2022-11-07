package com.bridgelabz;

public class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
        next = null;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}

