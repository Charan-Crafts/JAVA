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
        System.out.print("NULL");
        while(temp!=null){
            System.out.print("---"+temp.data+"---");
            temp=temp.next;
        }
        System.out.println("---NULL");
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

    public void insertAtIndex(int data,int idx){

        int currentIdx = 0;

        Node newNode = new Node(data);

        Node temp = head;

        while(currentIdx!=idx-1){
            temp=temp.next;
            currentIdx++;
        }

        newNode.next = temp.next;

        temp.next.prev = newNode;

        temp.next = newNode;

        newNode.prev =temp;

        size++;
    }

    public void deleteAtStart(){

        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }

        head.next.prev=null;

        head = head.next;
        size--;
    }

    public void deleteAtEnd(){

        if(head == null){

            System.out.println("Linked list is Empty");
            return;
        }

        Node temp = head;

        while (temp.next.next != null){

            temp = temp.next;
        }
        temp.next.prev=null;

        temp.next=null;

        size--;

    }

    public void deleteAtIndex(int idx){


        int currentIdx = 0;

        Node temp = head;

        while(currentIdx != idx-1){
            temp=temp.next;
            currentIdx++;
        }

        temp.next=temp.next.next;

        temp.next.prev=temp;

        size--;
    }
}
