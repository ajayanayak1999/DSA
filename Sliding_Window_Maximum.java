public class Sliding_Window_Maximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] max = new int[nums.length - k + 1];

        if (nums.length > 0 && k <= nums.length) {
            int i = 0;
            int j = i + k;

            while (j <= nums.length) {
                int maxValue = Integer.MIN_VALUE;
                for (int l = i; l < j; l++) {
                    if (maxValue <= nums[l]) {
                        maxValue = nums[l];
                    }
                }
                max[i] = maxValue;
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int[] arr1 = { 1 };
        int k = 1;
        int[] arr2 = maxSlidingWindow(arr1, k);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
