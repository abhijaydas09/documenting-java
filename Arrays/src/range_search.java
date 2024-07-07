public class range_search {
    public static void main(String[] args) {
        //Q : search the array given below for 3 in the range of index[1 to 4 ]
        int[] arrays = {18 , 19 , - 7  , 3 , 14 , 28} ;
        int target = 18;
        System.out.println(function1(arrays , target , 0 , 5));
    }
    static int function1(int[] arry , int target , int start  ,int end  ) {
        if (arry.length == 0 ){
            return  0 ;
        }
        for (int index = start; index <= end ; index++) {
            int element = arry[index];
            if (element == target){
                return index ;
            }
        }
        return 0 ;
    }
}
