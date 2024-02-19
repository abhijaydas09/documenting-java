package recursion2.Q1_To_Q6;
// we are taking the sum of the digits of the number.
public class sumDigits {
    public static void main(String[] args) {
        // sumdigit output  :
        System.out.println(sumdigits(451));

        // product digit output :
        System.out.println(productDig(546)); //wrong solution
        System.out.println(productDigit(546)); //my solution.
        // if number contains zero ?
        System.out.println(productDigit(505)); // yes it is giving me zero


    }
//Q4  :
    static int sumdigits(int number){
        if(number == 0) {
            return 0 ;
        }
        else {

            return  (number % 10)  + sumdigits(number /10) ;
        }
    }

//Q5  :

    // the wrong solution :
    static int productDig(int number){ //this function is returning me 0 ; why ?
        if(number == 0 ){
            return 0;
        }
        else {
            return (number%10) * productDig(number / 10) ;

        }
    }

    // correct solution / my solution  :
    static int productDigit(int num){
        if(num == 0 ){
            return 1 ;
        }
        else {
            return (num%10) * productDigit(num / 10) ;
        }
    }


}
