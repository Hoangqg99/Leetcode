package Leetcode75;

public class MaxConsecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeros++;
            while (zeros > k) {
                if (nums[left] == 0)
                    zeros--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        MaxConsecutive_Ones_III obj = new MaxConsecutive_Ones_III();
        int[] nums = { 0, 0, 0, 1 };
        int k = 4;
        int result = obj.longestOnes(nums, k);
        System.out.println("result: " + result);
    }
}
