package reccursion1.message_program;

/**
 * what is reccursion?
 * A function calling another  function
 * the body and function are same , they are exactly doing the same thing.r
 */

public class Q2_numberProgram {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);

        //after print 5 finished executing and will be removed from the stack.
        // print 4 will finish executing and will leave the stack.
        //similarly 3 and after that print2 will finish executing.
        //at last , print1 will be removed from the stack and will move towards main.
        //and finally with all the execution , main function will end at the last
    }
    // when a function finish executing , it is removed from the stack and the flow of program is restored
    // from where the function was called.
}
