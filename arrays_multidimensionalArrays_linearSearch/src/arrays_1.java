import java.util.Scanner;

public class arrays_1 {
    public static void main(String[] args) {

        //how to store 500 roll numbers ?
        int roll1 = 5 ;
        int roll2 = 6 ; // .......go on till 500
        //or use an array
        //syantax of array(array is collection of data type)
        // datatype[] variable_name = new datatype[size]
        int[] array1 = new int[10] ;
        System.out.println(array1[6]); // output = o
        String[] arr2 = new String[4];
        System.out.println(arr2[2]); // output = null
        int[] rows ; //hear there is declaration of array. rows is getting defined
        rows = new int[5] ; // here actual object is been created.

        // _________________________________________________________________________________________________
        // Q : write a programm which takes the values from the user and makes an array .
        int[] arry = new int[5] ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter your number in integer : ");
        int number = input.nextInt()  ;

        //for (int i = 0; i < arry.length ;  i++){
            //arry.length is used when we dont know the  lenght of an array .
          //  arry[i]  = input.nextInt() ;
            //System.out.println(arry[i]);
        //}
        for (int num : arry){
            System.out.println(num + " ");
        }
    }
}
