package easy_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * input  : arr [2,4,6,8] ; target : 10
 * output : [1,2]
 * q1 . how to map an array ?
 */

public class twosum {

    public static void main(String[] args) {
        int[] arr = {2,4,8,9,14,19} ;
        int target = 23 ;
        TwoSum(arr , target) ;

    }
    static int TwoSum (int[] arr , int target){

        int x ;

        for (int i = 0; i < arr.length-1 ; i++) {
            x = target - arr[i] ;
            for (int j = 1; j <arr.length ; j++) {
                if (x == arr[j]){
                    int[] array = {i , j } ;
                    System.out.println(Arrays.toString(array));
                }
            }

        }
        return 0  ;
    }
}
