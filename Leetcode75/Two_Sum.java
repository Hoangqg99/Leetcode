package Leetcode75;

import java.util.Arrays;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }

    // static boolean Two_Sum(int[] arr, int target) {
    // // two-pointers
    // int left = 0, right = arr.length - 1;
    // while (left < right) {
    // int sum = arr[left] + arr[right];
    // if (sum == target)
    // return true;
    // else if (sum < target)
    // left++;
    // else
    // right--;
    // }
    // return false;
    // }

    public static void main(String[] args) {
        Two_Sum solution = new Two_Sum();
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
