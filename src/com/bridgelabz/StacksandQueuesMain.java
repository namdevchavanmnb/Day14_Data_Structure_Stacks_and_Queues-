package com.bridgelabz;

import javax.xml.transform.stream.StreamSource;

public class StacksandQueuesMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queues");
        LinkedList <Integer>list=new LinkedList<>();
        list.push(70);
        list.push(30);
        list.push(56);
        list.show();
        list.pop();
        list.show();
        list.peak(30);
        list.show();
    }
}


