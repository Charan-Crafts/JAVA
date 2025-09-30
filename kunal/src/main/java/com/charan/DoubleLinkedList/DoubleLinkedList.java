package com.charan.DoubleLinkedList;

public class DoubleLinkedList {

    private class Node{

        private int data;

        private Node prev;

        private Node next;

        public Node(int data){

            this.data=data;
        }
    }

    private int size ;

    private Node head;

    public DoubleLinkedList(){

        size = 0;
    }

    public void insertAtStart(int data){

        Node newNode = new Node(data);

        if(head == null){

            head = newNode;

            size ++;
            return;
        }

        head.prev = newNode;

        newNode.next = head;

        head = newNode;

        size++;
    }


    public void display(){

        Node temp = head;

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        while(temp!=null){
            System.out.print("---"+temp.data+"---");
            temp=temp.next;
        }
        System.out.println("---End");
    }

    public void size(){

        System.out.println(size);
    }

    public void insertAtEnd(int data){

        Node newNode = new Node(data);

        if(head == null){

            head = newNode;

            size++;

            return;
        }

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        newNode.prev =temp;

        temp.next = newNode;

        size++;
    }
}
