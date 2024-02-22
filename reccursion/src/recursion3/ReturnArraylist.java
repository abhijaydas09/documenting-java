package recursion3;
// debug

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArraylist {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,4,5,8} ;
        System.out.println(function(arr , 4 , 0 ,new ArrayList<>() ));

    }
    //Q ; You are given an array {1,2,3,4,4,5,8}. if target =4 , you need to return [3,4].
    static ArrayList<Integer> function(int [] arr , int target , int index , ArrayList<Integer>list){
        // base case
        if(index == arr.length){
            return list ;
        }
        //body of recursion :

        if (arr[index] == target){// main function where the list will get added
            list.add(index);
        }
        // return function where it changes the index of an array to +1 ;
        return function(arr, target, index + 1 , list) ;
    }
}
