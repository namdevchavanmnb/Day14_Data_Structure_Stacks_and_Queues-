package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T datas) {
        Node<T> newNode = new Node(datas);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void show() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = (Node<T>) temp.getNext();
            }
            System.out.println();
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            T data = head.getData();
            head = (Node<T>) head.getNext();
            System.out.println(data);
        }
    }

    public void peak(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getData().equals(data))
                System.out.println(temp);
            break;
        }

    }
}