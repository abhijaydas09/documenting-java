public class Q1
{
    public static void main(String[] args) {
        int[] array ={1,3,4,6,7,8,9,10} ;
        int target = 5;
        int answer = binary_Search(array , target ) ;
        int target2 = 2 ;
        int answer2 = binary_Search(array , target2);
        System.out.println(answer);
        System.out.println(answer2);
    }
    static int binary_Search(int[] array , int target ){
        int start = 0 ;
        int end = array.length ;

        while(start <= end){
            //find middle element
            //int mid = ( start + end )/2 ;
            //if number very large other way
            int mid = start + (end - start) /2 ; // mid always give the position of the element.

            if (target<array[mid]) {
                //mid replacing position of element , array[mid] will show
                end = mid - 1;
            }else if (target>array[mid]){
                start = mid+ 1 ;
            }else{
                return mid ;
            }
        }
        return start ;
    }
}
