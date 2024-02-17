public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,0,3 , 7, 9 } ;
        //create a sorted array
    }
    public  int bubbleSort(int[] array){
        for (int i = 0 ;  i < array.length - 1 ; i++ ) {
            for (int j = 1; j < array.length ; j++) {
                if(array[j]< array[j  - 1 ]){
                    //swap
                    int temp = array[j] ;
                    array[j] = array[j - 1 ] ;
                    array[ j -1] = temp ;
                    //this is the way of swapping a number.

                }
            }
        }
        return 0 ;
    }


}
