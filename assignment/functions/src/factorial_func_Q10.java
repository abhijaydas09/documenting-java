import java.math.BigInteger;
import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
//        // Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//        //4! = 1 * 2 * 3 * 4 = 24
//          4 = 4 + 3 + 2 + 1 = 11
//        //3! = 3 * 2 * 1 = 6
//        //2! = 2 * 1 = 2
//        //Also,
//        //1! = 1
//        //0! = 1
public class factorial_func_Q10
{
    public static void main(String[] args) {
        long number = 12 ;
        factorial(number);
        add(number);
        Scanner input = new Scanner(System.in) ;
        BigInteger n1 = new BigInteger("12010230120301230120310302140120410240124012040124010410241024012401401") ;
        BigInteger n2  = new BigInteger("13139401394130490139410349104913049103491034910359130513851390513950185013958") ;
        BigInteger n3 = new BigInteger("012901390129039012391239012312903921039123092139123213123219329184984912849128492814981294819284912849128419849128491284989841948192841928495891583958205832058293523950238509238502958209358203958023958239058209385209385203958023850248509348093860938609548068450978490784097809658709580950975809507608059784096854068405968450968450694586094586049568045968045968450968450968405986409586059869038590435834905840248938424") ;
        BigInteger sum = n1.add(n2).add(n3) ;
        System.out.println(sum);
        BigInteger multiply = n1.multiply(n2).multiply(n3) ;
        System.out.println(multiply);

    }
    static void add(long number){
        long sum = 0 ;
        for (int i = 0 ; i <= number ; i++) {
            sum  = sum + i ;
        }
        System.out.println(sum);
    }
    static void factorial(long number){
        long factor = 1 ;
        for (int i = 1 ; i <= number; i++) {
            factor= factor* i ;
        }
        System.out.println(factor);
    }
}
