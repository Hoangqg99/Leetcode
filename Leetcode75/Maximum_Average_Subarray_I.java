package Leetcode75;

public class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        double windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        Maximum_Average_Subarray_I obj = new Maximum_Average_Subarray_I();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double result = obj.findMaxAverage(nums, k);
        System.out.println("result: " + result);
    }
}
