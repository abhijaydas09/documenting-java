package org.example;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

// small usecase of hashmap on taking input as name from user and displaying the marks of the student using hashmap.
public class Hashmaps {
    static HashMap<String, Integer > map = new HashMap<>();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("do you want to add data ? : 1");
            System.out.println("do you want to display data ? : 2");
            System.out.println("do you want to exit ? : 3");

            int choice = in.nextInt();
            in.nextLine() ;
            if (choice == 1){
                System.out.println("enter the name : ");
                String name = in.next() ;
                System.out.println("enter your marks: ");
                Integer marks = in.nextInt() ;
                in.nextLine() ;
                store(name , marks , "add");
            }
            if (choice == 2){

                System.out.println("enter the name : ");
                String name2 = in.nextLine() ;

                store(name2 , 0 , "display");
            }if (choice == 3){
                break;
            }
            else {
                System.out.println("invalid choice") ;
            }
        }
    }
    public static void store( String name  , Integer marks , String choice  ){
        if(choice.equals("add")){
            map.put(name , marks) ;
        }
        else if (Objects.equals(choice, "display")){
            Integer StudentMarks = map.get(name) ; // this is the way to get the value from the hashmap.
            if (StudentMarks == null){
                System.out.println("no data found");
            }
            else {
                System.out.println(STR."the marks of the student is : \{StudentMarks}");

            }
        }
    }

}