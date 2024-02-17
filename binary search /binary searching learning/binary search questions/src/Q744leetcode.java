public class Q744leetcode {
    public static void main(String[] args) {
        int[] array = {2,3,3,4,5,6,6,6,6,7,7,8,8,9,10} ;
        int target = 6 ;
        //here i need starting index of 6 and end of 6 therefore in this case it will be {5,8}.
    }
    public int binary_Search(int[] array , int target ){
        int[] ans ={- 1 , 1 } ;
        int start = 0 ;
        int end = array.length - 1 ;

        while (start<=end) {
            int mid = ( start+ end) / 2 ;

            if (target < array[mid]){
                end = mid - 1 ;

            } else if (target > array[mid]) {
                start = mid + 1 ;

            } else if (target == array[mid]) {
                for (int i = 0; i < mid ; i++) {
                    start = 0 ;
                    end = mid - 1  ;
                    if (target < array[mid]){
                        end = mid - 1 ;

                    } else if (target > array[mid]) {
                        start = mid + 1 ;

                    }else {
                        return mid ;
                    }
                    return mid ;
                }
                for (int i = mid; i < array.length ; i++) {
                    start = 0 ;
                    end = mid - 1  ;
                    if (target < array[mid]){
                        end = mid - 1 ;

                    } else if (target > array[mid]) {
                        start = mid + 1 ;

                    }else {
                        return mid ;
                    }
                    return mid ;


                }
            }

        }

        return ans[1];
    }

}