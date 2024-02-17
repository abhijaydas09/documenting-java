public class binary {
    public static void main(String[] args) {
        int[] array = {-18,-5,-1 , 2,3,4,16,18, 22} ;
        int target  =4;
        int answer = binary_Search(array , target) ;
        System.out.println("hellow world");
        System.out.println(answer);
        System.out.println("hellow world");

    }
    static int binary_Search(int[] array , int target ){
        int start = 0 ;
        int end = array.length-1 ;

        while(start <= end){
            //find middle element
            //int mid = ( start + end )/2 ;
            //if number very large other way
            int mid = start + (end - start) /2 ; // mid always give the position of the element.

            if (target<array[mid]) {
                //mid replacing position of element , array[mid] will show
                end = mid - 1;
            }else if (target>array[mid]){
                end = mid+ 1 ;
            }else{
                return mid ;
            }
        }
        return -1 ;
    }

}
