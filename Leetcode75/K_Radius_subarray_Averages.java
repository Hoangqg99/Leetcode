package Leetcode75;

import java.util.Arrays;

public class K_Radius_subarray_Averages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Gán mặc định -1
        if (2 * k + 1 > n)
            return result;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (i >= 2 * k) {
                if (i > 2 * k)
                    sum -= nums[i - 2 * k - 1];
                result[i - k] = (int) (sum / (2 * k + 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        K_Radius_subarray_Averages solution = new K_Radius_subarray_Averages();
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;
        int[] result = solution.getAverages(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
