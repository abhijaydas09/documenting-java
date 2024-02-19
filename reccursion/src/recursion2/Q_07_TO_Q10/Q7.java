package recursion2.Q_07_TO_Q10;
// reverse a number  :
public class Q7 {
    static int sum = 0 ;
    static void reverse(int number){
        // when to use int and when to use void in recursion ?
        if (number == 0 ){
            return;
        }
        int rem = number  % 10 ;
        sum = sum  * 10  + rem ;
        //System.out.println(sum); this will print the number every time it iterate ,
        // therefor we keep print outside.
        reverse(number / 10);
    }

    //other solution


    public static void main(String[] args) {
        reverse(583);
        System.out.println(sum);

    }


}
