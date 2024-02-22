package recursion3;

import java.util.ArrayList;

/**
 * hey
 */
public class LinearSearch_Recursion {
    public static void main(String[] args) {
        int [] arr = {3,2,1,18,9} ; // what if
        System.out.println(linearsearch_recursion(arr , 15 , 0));

    }

    /**
     *
     * @param
     * @return
     */
    static int linearsearch_recursion(int[] arr  , int target, int i){
        if (arr[i] == target){
            return target;
        }else if(arr[i] != target)
        {
            return linearsearch_recursion(arr , target , i + 1)  ;
        }
        else {
            return 0  ;
        }
    }


    // kunal's solution:
    static boolean linearsearch_rec(int[] arr  , int target, int i){
        if(i ==arr.length){
            return false ;
        }
        return arr[i] == target || linearsearch_rec(arr, target, i + 1) ;
    }


}
