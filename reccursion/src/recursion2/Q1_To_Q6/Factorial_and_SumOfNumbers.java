package recursion2.Q1_To_Q6;

public class Factorial_and_SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(20));
        System.out.println(sumNumber(5));
    }

    //Q2 :
    static long factorial(long number){
        if (number ==1 ){
            return number;
        }
        else {
            return number * factorial(number-1) ;
            //I did't understood the logic first bt the change in code is working.
        }
    }
    //Q3  :
    static long sumNumber(int number){
        if(number == 1){
            // what is the difference between number == 1 and number  <= 1 in the base case situation ? ;
            return 1;
        }
        else {
            return number + sumNumber(number - 1) ;

        }
    }
}
