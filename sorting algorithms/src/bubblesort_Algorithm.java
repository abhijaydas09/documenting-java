import java.util.Arrays;
import java.util.Scanner;

public class bubblesort_Algorithm {
    public static void main(String[] args) {
        int[] array = {7,4,5,3,2,1,8,9} ;
        Bubblesort(array);
        System.out.println(Arrays.toString(array));
        Scanner take_value = new Scanner(System.in) ;

        
    }


    static int findLargestElement(int[] arr)
            //this is a function to find me the largest element present on the array.
    {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static void swap(int[] array , int first , int second )
    {
        int temp = array[first] ;
        array[first] = array[second] ;
        array[second] = temp ;
    }

    static void Bubblesort(int[]array )
    {
        for (int i = 0; i < array.length - 1 ; i++)
        {
            for (int j = 1; j < (array.length -1 ) - i ; j++)
            {
                if (array[j] < array[j-1])
                {
                    int temp = array[j] ;
                    array[j] = array[j-1] ;
                    array[j-1] = temp ;

                }

            }
        }

    }
}
