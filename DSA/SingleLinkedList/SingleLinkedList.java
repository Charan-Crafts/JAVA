public class SingleLinkedList{

    Node head;

    class Node{
        int data;
        Node next;
    }

    public void insertAtLast(int data){

        Node newNode = new Node();

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current=current.next;
        }
        current.next = newNode;
    }
    
    public void insertAtStart(int data){

        Node newNode = new Node();

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {

        System.out.print("Single Linked List");

    }
}