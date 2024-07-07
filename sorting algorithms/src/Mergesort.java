public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {5, 44, 23, 26, 46, 7, 53, 753};
        mergesort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void conqure(int[] nums, int start, int mid, int end) {
        int temp_arr[] = new int[end - start + 1];
        int left = start ;// left taken as start  ;
        int right = mid ;
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
        while (left <= mid) {
            temp_arr[temp_element] = nums[left];
            temp_element++;
            left++;
        }
        while (right < end) {
            temp_arr[temp_element] = nums[right];
            temp_element++;
            right++;
        }
        for (int i = start; i <= end; i++) {
            nums[i] = temp_arr[i - start];
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
    public static void mergesort(int[] nums) {
        divide(nums, 0, nums.length - 1);
    }

}