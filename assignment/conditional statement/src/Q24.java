import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        int Sum = 0 ;
        Scanner input = new Scanner(System.in) ;

        while (true){
            System.out.println("enter your number");
            int number = input.nextInt() ;
            Sum += number ;
            if (number==0){
                break;
            }
        }
        System.out.println(Sum);

    }

}
