public class Mergesort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10};
        divide(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            int[] arr = {};
        }
    }
    public static void conqure(int[] nums, int start, int mid, int end) {
        int temp_arr[] = new int[end - start + 1];
        int left = 0;
        int right = mid + 1;
        int temp_element = 0;
        while (left <= mid && right <= end) {
            if (nums[left] < nums[right]) {
                temp_arr[temp_element] = nums[left];
                temp_element++;
                left++;
            } else {
                temp_arr[temp_element] = nums[right];
                temp_element++;
                right++;
            }
        }

    }
    public static void divide(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        divide(nums, start, mid);
        divide(nums, mid + 1, end);
        conqure(nums, start, mid, end);
    }

}