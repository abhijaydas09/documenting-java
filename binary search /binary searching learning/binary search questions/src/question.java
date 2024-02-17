public class question {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 10 ;
        int x = BinarySearch( array , target ) ;
        System.out.println(x);

    }
    static int BinarySearch(int[]array , int target)
    {
        int start = 0  ;
        int end = array.length  ;

        while (start <= end)
        {
            int mid = (start+end) / 2 ;
            if (target < array[mid])
            {
                end = mid -1 ;
            }
            else if (target > array[mid])
            {
                start = mid + 1 ;
            }
            else
            {
                return mid  ;
                // returning the index of the number
            }

        }
        return -1 ;
    }
}
