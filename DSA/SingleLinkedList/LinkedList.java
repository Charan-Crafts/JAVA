class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

public class LinkedList {
    Node head;

    private int size;

    LinkedList(){
        this.size=0;
    }

    public void insertAtStart(int data){

        // Create a new Node with the data 

        Node newNode = new Node(data);


        if(head == null){
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtEnd(int data){

        // Create a new Node with the data

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            size++;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next= newNode;
        size++;
    }

    public void display(){

        if (head == null){

            System.out.println("Linked list is empty");
            return;
        }

        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println();
    }

    public void deleteAtFirst(){

        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        head=head.next;
        size--;
    }
    
    public void deleteAtLast(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        // Handle 1 Node Case

        if(head.next == null){
            head=null;
            size --;
            return;
        }
        

        Node currNode = head;

        while(currNode.next.next != null){
            currNode=currNode.next;
        }
        currNode.next = null;
        size --;
    }

    public static void main(String[] args) {
        
    }
}
