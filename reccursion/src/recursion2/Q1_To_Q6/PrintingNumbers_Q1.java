package recursion2.Q1_To_Q6;

public class PrintingNumbers_Q1 {
    public static void main(String[] args) {
//        System.out.println(printingNumber_maxToMin(4)) ;
//        System.out.println("\n");
//        System.out.println(printingNumber_minToMax(1 , 9));
        printingBoth(1,5) ;


    }
    //Q1  :
    static int printingNumber_maxToMin(int max_number){
        if (max_number == 1){
            System.out.println(max_number);
            return max_number ;
        }
        else {
            System.out.println(max_number);
            return printingNumber_maxToMin(max_number - 1 ) ;
        }
    }

    static int printingNumber_minToMax(int n ,int max_number){

        if ( n == max_number){
            return max_number ;
        }else {
            System.out.println(n);
            return printingNumber_minToMax(n +1  , max_number)  ;
        }
    }

    static int printingBoth(int number , int max_number){
        printingNumber_minToMax(number , max_number) ;
        printingNumber_maxToMin(max_number) ;

        return 0 ;
    }

}
