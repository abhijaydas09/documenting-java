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

    //Given a signed 32-bit integer x, return x with its digits reversed.
    // If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}