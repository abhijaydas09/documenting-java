public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {4,6,9,10,32} ;
        int ans = linearSearching(arr , 32) ;
        System.out.println(ans);
    }
    static int linearSearching(int[] arr , int target){
        if(arr.length ==0){
            return -1 ;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index] ;
            if (element == target){
                return index ;
            }
        }
        return -1 ;
    }
}
