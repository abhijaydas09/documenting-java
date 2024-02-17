package reccursion1.message_program;

public class Q2_numberProgram_Recursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 number 1 ,2 ,3 , 4 , 5 .
        print34(3);



    }
//    static void print(int n){
//        // this code will kind of give me an error.
//        System.out.println(n);
//        print(n  +1 ); // called the method print n+1 times .
//        //this will call till the recursive limit because there is no stopping of the recursive function.
//        // therefor we need a base condition where we need to stop the recursion. threfore
//    }
    static void print34(int n){
        // base condition
        if ( n == 5 ){
            System.out.println(5);
            return;
            //The return; statement is used to exit the print34 method when the base condition
            // (n == 5) is met.
        }
        System.out.println(n);
        print34( n  + 1 );

    }

}


