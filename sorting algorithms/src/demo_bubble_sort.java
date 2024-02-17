import java.util.Arrays;

public class demo_bubble_sort {


    public static void main(String[] args) {
        int[] array = {1,9,20,4,6,3,7} ;
        bubblesort(array);
        System.out.println(Arrays.toString(array));


    }
    static void swap(int[] array , int first , int second )
    {
        int temp = array[first] ;
        array[first] = array[second] ;
        array[second] = temp ;
    }
    static void bubblesort(int[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = 1; j <( array.length- 1) - i ; j++) {
                if (array[j -1 ] > array[j]){
                    swap(array , array[j - 1], array[ j ]);
                }

            }

        }

    }
}
