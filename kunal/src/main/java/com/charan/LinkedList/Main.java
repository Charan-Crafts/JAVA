package com.charan.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertAtStarting(20);

        linkedList.insertAtStarting(10);

        linkedList.insertAtEnd(100);

        linkedList.insertAtEnd(120);

        linkedList.insertByIndex(50,2);

        linkedList.insertByIndex(70,3);

        linkedList.insertByIndex(0,0);

        linkedList.deleteFirst();

        linkedList.deleteLast();

        linkedList.deleteByIndex(1);

        linkedList.display();



        linkedList.size();

    }
}
