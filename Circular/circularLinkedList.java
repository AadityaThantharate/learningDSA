package Circular;

public class circularLinkedList {
    private Node head;
    private Node tail;
    

    public circularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addFront(int data){
        Node newNode = new Node (data);
        if(head == null){
            this.head = newNode;
            this.tail = newNode;

            head.next = head;
            head.prev = head;
        }else{
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next=newNode;
            head = newNode;
        }
    }

    //add data in end
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            this.head = newNode;
            this.tail = newNode;

            head.next = head;
            head.prev = head;
        }else{
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Delete from front
    public void deleteFront(){
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        if (head == tail) {
            head= null;
            tail = null;
        }else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }
    public void deleteEnd(){
        if(tail == null){
            System.out.println("Empty List");
            return;
        }
        if (head == tail) {
            this.tail = null;
            this.head = null;
        }else{
            tail = tail.prev;
            tail.next = head;
            head.prev =tail;
        }
    }
    public void displayForward(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }while(temp!=head);
            System.out.println();
        
    }
    public void displayBackward(){
        if(tail == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = tail;
        do{
            System.out.println(temp.data+"\t");
            temp = temp.prev;
        }while(temp!=tail);{
            System.out.println();
        }
    }
    // public void searchElement(int target){
    //     if(tail ==null){
    //         System.out.println("list is empty");
    //         return;
    //     }for(int i=0 ;i<tail; i++){
    //         int li  =  
    //     }
    // }
}
