
// R1

import java.util.Arrays;

public class Quicksort_1 {

    public static void main(String[] args) {
//        int[] arr2 = {5,4,3,2,1} ;
//        quick_sort(arr2 , 0 , arr2.length - 1);
//        System.out.println(Arrays.toString(arr2));

        int[] arr = {5,44,23,26,46,7,53,753} ; //incorrect output  :
        quick_sort(arr , 0 , arr.length -1) ;
        System.out.println(Arrays.toString(arr));

    }
    // the whole idea of quick sort is to put the pivot in the right position.
    static void quick_sort(int[] nums,int low , int high  ){
        if (low  >= high){
            return;
        }
        int s = low , e = high  , mid = s  + (e-s) / 2 , pivot = nums[mid] ;
        while (s <=e){
            while (nums[s] < pivot){
                s++ ;
            }
            while (nums[e] > pivot){
                e-- ;
            }
            while (s <= e){
                // error in while loop  - after shifting with one temp ,  the while loop is not getting end and the pointer is not getting to " / while (nums[s] < pivot){} /"
                int temp = nums[s] ;
                nums[s] = nums[e] ;
                nums[e] = temp ;
                s++ ;
                e-- ;
            }
        }
        quick_sort(nums , low , e);
        quick_sort(nums ,high , s );

    }
}
