public class trialanderror {
    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        int x = removeDuplicates(array) ;
        System.out.println(x);

    }

        static int removeDuplicates(int[] nums) {
            int j = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
                int[] new_array ;
                new_array = new int[j] ;

            }
            return j;
        }

    }

