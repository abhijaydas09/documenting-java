package easy_problems;

import java.util.Arrays;

public class twosum_diffsoln {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,10 ,15} ;
        int target = 18 ;
        int[] var=  twoSum(arr , target) ;
        System.out.println(Arrays.toString(var));

    }
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }
}


