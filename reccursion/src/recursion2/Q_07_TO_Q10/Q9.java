package recursion2.Q_07_TO_Q10;

public class Q9 {
    public static void main(String[] args) {
       // System.out.println(checkNumZero(40000 , 0));
        System.out.println(count(43204500));

    }
    // Important concept :
    // how to end the function because we can't keep it zero !
    static int checkNumZero(int number , int count ){//no base condition.

        if(number == 0){
            return checkNumZero(number/10 , count++) ;
        }
        else {
            return checkNumZero(number / 10, count);
        }
    }
    //this is not working 
    
    // Kunal's method
    // debug this once.
    static int count(int n){
        return helper(n , 0) ; 
    }

    private static int helper(int n, int c) {
        if(n == 0 ){
            return c ;
        }
        int rem = n %10 ;
        if (rem == 0 ){
            return helper(n/10 , c + 1) ;
        }
        return helper(n/10 , c) ;
    }

}
