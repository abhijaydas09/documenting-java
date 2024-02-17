import java.util.Arrays;

public class arrays_4 {
    public static void main(String[] args) {
        //my code
//        int[][] arr =
//                {
//                        {1,3,5},
//                        {3 , 4 , 5 } ,
//                        {4,8,1} ,
//
//                } ;
//        System.out.println(arr[1][2]);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]  +  "" );
//                System.out.println(Arrays.toString(arr[i][j]));
//
//            }
//        }
        //-----------------------------------------------------------------------------
        // copied code

        // Step 1: Define the size of the array
        final int ROWS = 3;
        final int COLS = 4;

        // Step 2: Use the `new` keyword to create a new array with the specified size
        int[][] matrix = new int[ROWS][COLS];

        // Step 3: Assign values to the array elements using nested loops
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = i * j;
            }
        }

        // Print the matrix
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
