package Leetcode75;

public class longestSubarray {
    public int longestSubarray(int[] nums) {
        int left = 0, maxLen = 0, zeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeros++;
            while (zeros > 1) {
                if (nums[left] == 0)
                    zeros--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        longestSubarray obj = new longestSubarray();
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        int result = obj.longestSubarray(nums);
        System.out.println("result: " + result);
    }
}
