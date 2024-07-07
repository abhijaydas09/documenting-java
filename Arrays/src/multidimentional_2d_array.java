import java.util.Arrays;
import java.util.Scanner;

public class multidimentional_2d_array {
    public static void main(String[] args) {

        int[][] array2 = {
                {2, 5, 6},
                {3, 4, 5},
                {4, 535, 2},
                {3, 4, 5}
        };


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }

        }

//        int[][] array = new int[3][3] ;
//
//        //taking the input from the user
//
//        for(int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.println(array[row][col]);
//
//            }
//            System.out.println(Arrays.toString(array));
//
//        }
    }
}
