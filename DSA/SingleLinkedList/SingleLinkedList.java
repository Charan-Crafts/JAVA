public class SingleLinkedList{

    Node head;

    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
        }

        
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;

        while(current != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("");
    }
    public void insertAtLast(int data){

        Node newNode = new Node(data);

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

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void deleteFirst(){

        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node current = head;
        head = current.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }
        if(head.next == null){
            head=null;
            return;
        }

        Node current = head;

        while(current.next.next != null){
            current = current.next;
        }
        current.next=null;
    }
    
    public static void main(String[] args) {

        System.out.println("Single Linked List");

        SingleLinkedList list = new SingleLinkedList();

        list.insertAtLast(12);

        list.insertAtStart(2);

        list.insertAtLast(20);

        

        list.display();

        list.deleteFirst();

        list.display();

        list.deleteLast();

        list.display();
    }
}