package Leetcode75;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {
    public int maxOperations(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;
        // for (int num : nums) {
        // int taget = k - num;
        // if (map.getOrDefault(taget, 0) > 0) {
        // count++;
        // map.put(taget, map.get(taget) - 1);
        // } else {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // }
        // return count;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaxNumberofKSumPairs obj = new MaxNumberofKSumPairs();
        int[] nums = { 1, 2, 3, 4 };
        int k = 5;
        int result = obj.maxOperations(nums, k);
        System.out.println("result: " + result);
    }
}
