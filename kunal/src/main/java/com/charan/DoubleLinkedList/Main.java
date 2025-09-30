package com.charan.DoubleLinkedList;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList DLL = new DoubleLinkedList()  ;

        DLL.insertAtStart(20);

        DLL.insertAtStart(10);

        DLL.insertAtEnd(100);

        DLL.insertAtEnd(120);

        DLL.insertAtIndex(30,2);

        DLL.insertAtIndex(40,3);

        DLL.insertAtIndex(110,5);



        DLL.deleteAtStart();

        DLL.deleteAtStart();

        DLL.deleteAtEnd();

        DLL.deleteAtEnd();

        DLL.deleteAtIndex(1);

        DLL.deleteAtIndex(1);

        DLL.display();

        DLL.size();


    }
}
