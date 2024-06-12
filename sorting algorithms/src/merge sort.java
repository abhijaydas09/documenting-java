package merge_sort;
// to do - complete akrabazzi formula from time complexity

// wrong output. Debug and try to solve the issue.
//Merge sort - 20:00
import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;
public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1}  ;
        arr = mergesort(arr) ;
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergesort(int[] array){
        //base condition
        if(array.length ==1 ){ // why ? intuition behind this ? -
            return array ;
        }
        int mid = array.length /2 ;
        int[] left = mergesort(Arrays.copyOfRange(array , 0 , mid)) ; //why did i called the mergesort function ?
        int[] right = mergesort(Arrays.copyOfRange(array , mid , array.length)) ; //why mid ? why not mid + 1 ?

        return merge(left , right) ;
    }
    static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length + second.length] ; //this is to mix the arrays.
        int i  = 0, j  = 0 , k  = 0 ;// why 3 pointer
        while (i < first.length && j <second.length) {
            if(first[i] < second[j]){
                mix[k] = first[i] ;
                i++ ;
            }else {
                mix[k] = second[j] ;
                j++ ;
            }
            k++ ;
        }
        // it may be possible that one of the arrays is not complete.
        // like if there's an odd number then there will be one element left at the end to add that
        // either i  < j or j<i .
        while (i< first.length){
            mix[k] = first[i] ;
            i++  ;
            k ++ ;
        }
        return mix ;

    }
}

