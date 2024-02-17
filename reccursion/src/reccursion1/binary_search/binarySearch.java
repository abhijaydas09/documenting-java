package reccursion1.binary_search;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,10} ;
        // if we use array.length only then where will never be start > end situation and when ever there will be search
        //outside the array after the last number
        int var = binarySearch_reccursion(arr , 3 , 0 , arr.length ) ;
        System.out.println(var);// giving the output 4.

    }
    static int binarySearch_reccursion(int[] array , int target ,  int start , int end ){
        if(start  > end ){
            return  - 1 ;  // because couldn't find the element. same as binary search.
        }
        int mid = start  + (end - start)/2 ;
        if (target == array[mid] ){
            return mid ;
        } else if (target < array[mid]) {
            return binarySearch_reccursion(array , target , start ,  mid - 1) ;
            // make sure to return the result of a function call of the return type if theres a return type.
        }
        return binarySearch_reccursion(array , target , mid+1  , end) ;
    }
}
