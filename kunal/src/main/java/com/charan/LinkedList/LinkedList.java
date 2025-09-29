package com.charan.LinkedList;

public class LinkedList {

    private int size;

    private Node head;

    private Node tail;

    public LinkedList() {

        this.size = 0;
    }

    // Insert the Node at beginning

    public void insertAtStarting(int data) {

        // Create the Node

        Node newNode = new Node(data);

        // Check if head is null than it is first Node

        if (head == null) {

            head = newNode;

            tail = head;
            return;
        }

        newNode.next = head;

        head = newNode;

        size++;

    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "-->");

            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if(tail == null ){

            head = newNode;
            tail= head;
        }

        tail.next = newNode;

        tail=newNode;

        size++;



    }

    public void size(){
        System.out.println(size);
    }

    public void insertAt
    class Node {

        private int data;

        private Node next;

        public Node(int data) {

            this.data = data;
        }
    }
}
