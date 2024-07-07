import java.util.Arrays;

public class multidimentional_array {
    public static void main(String[] args) {
        int[][] flats ;
        flats = new int[3][3] ;
        flats[0][0] = 3 ;
        flats[0][1] = 4 ;
        flats[0][2] = 6 ;
        flats[1][0] = 10 ;
        flats[1][1] = 14  ;
        flats[1][2] = 17 ;
        flats[2][0] = 118 ;
        flats[2][1] = 321 ;
        flats[2][2] = 345 ;
        System.out.println(flats[1][2]);
        for (int i = 0; i < flats.length ; i++) {
            for (int j = 0; j < flats.length ; j++) {
                System.out.println(flats[i][j]);

            }

        }






//        int[] nums = {3, 4, 5, 12};
//        System.out.println(Arrays.toString(nums));
//        //Arrays.toString(nums) = This method converts the nums array into
//        // a string that represents its contents. The elements of the array
//        // are separated by commas and enclosed in square brackets (e.g., [1, 2, 3]).
//        int[] var = change(nums) ;//q : how do I store this in a variable.
//
//        System.out.println(Arrays.toString(var));
//        System.out.println(Arrays.toString(nums));
//
//    }
//    static int[] change(int[] arr){
//        arr[0] = 99 ;
//        return arr;
//    }
    }
}
