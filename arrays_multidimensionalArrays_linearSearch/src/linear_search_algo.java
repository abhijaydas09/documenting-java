public class linear_search_algo {
    public static void main(String[] args) {
        int[] nums = {23, 34, 45, 4, 7, 86};
        int target = 5;
        int Answer1 = linear_Search(nums, target);
        System.out.println(Answer1);
        boolean Answer2 = linear_search2(nums, target); // boolean will come on answer 2 because this variable is going to be a true false statement
        System.out.println(Answer2);
    }

    static boolean linear_search2(int[] arry, int target) {
        for (int element : arry) {
            if (element == target) {
                return true;
            }
        }
        return false;

    }

    static int linear_Search(int[] arry, int target) {
        if (arry.length == 0) {
            //if row of an array is zero it will return 1 .
            return -4;
        }
        for (int index = 0; index < arry.length; index++) {
            int element = arry[index]; //doubt

            if (element == target) {
                return index;
            }

            //i understood this one .

//        for (int element : arry ) {
//            if (element== target){
//                return element ;
//            }
//        }
            // what if you need to return true or false


            return -2;
        }
        return 0 ;
    }
}
