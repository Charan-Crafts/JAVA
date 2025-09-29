package com.charan.LinkedList;

public class LinkedList {

    class Node {

        private int data;

        private Node next;

        public Node(int data) {

            this.data = data;
        }
    }

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

    public void insertByIndex(int data,int indexValue){

        int currentIndex = 0;

        if(size == indexValue){
            insertAtEnd(data);
            return;
        }

        if(indexValue == 0){
            insertAtStarting(data);
            return;
        }


        Node newNode = new Node(data);

        // Temp Node

        Node temp = head;

        while(currentIndex != indexValue-1){

            temp=temp.next;
            currentIndex++;

        }

        newNode.next = temp.next;

        temp.next = newNode;

        size++;
    }

    public void deleteFirst(){

        if(head == null){
            System.out.println("Linked list is Empty");

            return;
        }

        head = head.next;

        size--;
    }

    public  void deleteLast(){

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;

        tail = temp;

        size --;
    }

    public void deleteByIndex(int indexNumber){

        int currentIdx = 0;


        Node temp = head;

        while(currentIdx!=indexNumber-1){

            temp=temp.next;

        }
        temp.next=temp.next.next;

        size --;
    }

}
