package reccursion1.fibonachi;
// find the n'th fibonachi number.
// eg  - 0 , 1 , 1 , 2 , 3 , 5......
// adding the first and second element.

public class findFibonachi {
    public static void main(String[] args) {
        fib_number_my_soln(5);
        System.out.println(fibonachiNumber(4));
        System.out.println(fibonachiNumber(50));
        // bad search  - takes a long amount of time to return the fib number.

    }
    // wrong
    static  void fib_number_my_soln(int n){
        if (n == 5){
            return;
        }
        fib_number_my_soln(n+1 +n );
    }
    //

    //
    // kunal's example :-

    static int fibonachiNumber(int n){
        // base condition :

        if (n < 2){
            // here in this step the method is checking if n is less than 2 ,
            // if not move to other return function
            return n ;
        }

        return fibonachiNumber(n - 1)  + fibonachiNumber(n - 2) ;
    }


}
