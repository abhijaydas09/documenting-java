package org.example;

public class Doubly_linkedList {
    Node head ;

    public static void main(String[] args) {
        Doubly_linkedList list = new Doubly_linkedList() ;
        list.insertFirst(4); // inserts the first element in the linked list.
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insert_last(8);// inserts the last element in the linked list.
        list.insert_after(98 , 5); // inserts the element after the given data .
        list.display(); // displays the linked list.
        list.printNodeRecursively(list.head); // prints the linkedlist in the reverse manner .
        list.print_node_in_reverse_order_recursively(list.head); //prints the linked list in reverse order.
        System.out.println("");
        System.out.println(list.find_value(4)); //prints the doubly linked list name.
    }
    public void insertFirst(int value ){
        Node node = new Node(value) ;
        node.next = head ;
        node.previous = null ;
        if (head != null){
            head.previous = node ;
        }
        head = node ;

    }
    public void insert_last(int value){
        Node node = new Node(value) ;
        Node temp = head;
        node.next = null ; //irrespective of the case node will always point to null.
        if (temp == null){
            head = node ;
            node.previous = null ;

        }
        while (temp.next != null ){
            temp  =temp.next ;
        }
        temp.next = node ;
        node.previous = temp ;

    }
    public void insert_after(int val  , int data){
        Node node  = new Node(val) ;
        if (head.value == val){
            insertFirst(val);
        }
        //two pointers
        Node first = head ;

        //insert after
        while(first.next.value != data){
            first = first.next ;
        }
        //when value of first == value we will assign things
        //main function  ;
        //important :
        node.next = first.next ;
        first.next = node ;
        node.previous = first ;
        node.next.previous = node ;

    }
    public Node find_value(int value){
        Node temp = head ;
        if (temp == null){
            Node node = new Node(000) ;
            System.out.println("node not found ");
            return node ;
        }
        while (temp.value != value){
            temp = temp.next ;
        }
        return temp ;

    }
    public void display(){
        Node current = head ;
        if (head == null){
            System.out.println("your list is empty");
            return ;
        }
        while (current != null){
            System.out.print(current.value  + "--> ");
            current = current.next ;
        }
        System.out.print("finish ");
        System.out.println("");
    }
    public void printNodeRecursively(Node node ){
        if (node ==null ){
            System.out.println("null");
            return ;
        }
        System.out.print(node.value  + "->");
        printNodeRecursively(node.next);
    }
    public void print_node_in_reverse_order_recursively(Node node ){
        if (node == null){
            return ;
        }
        print_node_in_reverse_order_recursively(node.next);
        System.out.print(node.value  + " -> ");
    }
    public class Node {
        int value ;
        Node next ;
        Node previous ;

        public Node (int value ) {
            this.value = value ;
        }
        public Node(int value  , Node previous , Node next){
            this.value = value ;
            this.previous = previous ;
            this.next = next ;
        }
    }
}
