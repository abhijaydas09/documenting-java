package org.example;

public class CircularLinkedlist {
    public static void main(String[] args) {
        CircularLinkedlist list = new CircularLinkedlist() ;
        list.insert_first(3) ;
        list.insert_first(5) ;
        list.insert_first(4) ;
        list.insert_first(6) ;
        list.insert_first(7) ;
        list.deleteElement(4);
        list.display_all_nodes();

    }

    public void insert_first(int data){
        Node node  = new Node(data) ;
        if (head == null){
            head = node ;
            tail = node ;
            return ;
        }
        tail.next = node ;
        node.next = head ;
        tail = node ;
    }
    public void deleteElement (int data){
        Node current =  head  ;
        while(current.next.value != data ){
            current = current.next  ;
        }
        current.next =  current.next.next ;
    }

    public void display_all_nodes(){
        Node temp = head ;
        while (temp != tail){
            System.out.print(temp.value + "->");
            temp = temp.next ;
        }
        System.out.print(temp.value+  "-> ");
        System.out.print("head");

    }
    public class Node{
        int value ;
        Node next ;

        Node (int value){
            this.value = value ;
        }
        Node(int value , Node next){
            this.value  = value  ;
            this.next = next ;
        }

    }

    Node head ;
    Node tail ;
}
