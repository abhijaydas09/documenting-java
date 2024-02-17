package reccursion1;
/**
 *the most important method for dynamic programming.
 */

public class introduction {
    // write a function that prints hello world.
    public static void main(String[] args) {
        message();
        // how to print hello world 5 times without calling the method message() 5 times or altering the message?


    }

    static void message(){
        //a function message calling other message
        System.out.println("hey , hello world ");
        message1();
        message2();
        message3();
        message4();
    }
    static void message2(){
        System.out.println("hey , hello world ");
    }
    static void message1(){
        System.out.println("hey , hello world ");
    }
    static void message3(){
        System.out.println("hey , hello world ");
    }
    static void message4(){
        System.out.println("hey , hello world ");
    }
}
