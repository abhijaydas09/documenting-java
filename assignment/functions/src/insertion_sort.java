
public class insertion_sort {
    public static void main(String[] args) {
        int[] array = {1,4,7,5,8,9,3} ;
    }
    static void swap(int[] array , int first , int second ){
        int temp = array[first] ;
        array[first] = array[second] ;
        array[second] = temp ;
    }

    static int insertion(int[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i + 1; j <array.length ; j++) {
                if (array[j] < array[j-1]){

                }
                
            }
            
        }
        return 0 ;
    }

}
