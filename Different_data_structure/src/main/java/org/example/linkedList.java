package org.example;

public class linkedList {
    public static void main(String[] args) {
        linkedList list = new linkedList() ;
        list.insert_first(3);
       list.insert_first(5);
       list.insert_first(6);
       list.insert_first(9);
       list.delete_element(6);

        list.print_full_linkedList();
    }
    public Node head ;
    //create a node
    class  Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    //addition - add first
    public void insert_first(int data){

        Node newNode = new Node(data) ;
        if (head == null){
            head = newNode ;
            return;
        }
        newNode.next = head ;
        head = newNode  ; //swapping the element.
    }
    public void add_last(int data){
        Node newnode = new Node(data) ;
        Node current = head ;
        if (head == null){
            head = newnode ;
            return ;
        }
        while(current.next != null){
            current = current.next ;
        }
        current.next = newnode ;

    }
    public void delete_element(int data){
        if (head == null){
            System.out.println("your linked list is empty.");
            return  ;
        }
        if (head.data == data){
            head  =head.next ;
            return ;
        }
        Node current = head  ;
        Node previous = head ;  //why this ?
        // because we need to keep track of the previous node to the current node.
        while (current.data != data){
            previous = current ;
            current = current.next ;
        }
        if (current == null){
            System.out.println("element not found ");
            return;
        }
        previous.next = current.next ;

    }
    public void print_full_linkedList(){
        Node current = head ;

        if (current == null){
            System.out.println("your linked list is empty.");
        }

        while(current != null){
            System.out.println(current.data);
            current = current.next ;
        }
        System.out.println("NULL");
    }


}
