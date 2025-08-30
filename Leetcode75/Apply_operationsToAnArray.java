package Leetcode75;

import java.util.Arrays;

public class Apply_operationsToAnArray {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
        }
        while (left < nums.length) {
            nums[left++] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        Apply_operationsToAnArray sl = new Apply_operationsToAnArray();
        int[] nums = { 1, 2, 2, 3, 0, 4, 0 };
        System.out.println(Arrays.toString(sl.applyOperations(nums)));
    }
}
