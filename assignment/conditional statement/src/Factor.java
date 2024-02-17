import java.util.Scanner;

public class Factor
{
    public static void main(String[] args) {
        System.out.println("Input a number and print all the factors of that number (use loops)");
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter a number  :");
        int number = input.nextInt() ;

        int factor = 1 ;
        while (factor <= number)
        {
            if (number % factor == 0 ){
                System.out.println(factor);
            }
            ++ factor ;
        }
        // what if i want to store the output (1,2,5 and 10 in the case of number as 10) in an array

    }
}
