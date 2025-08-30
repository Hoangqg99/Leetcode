package Leetcode75;

public class Remove_Dulicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int k = 1; // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k; // Return the new length of the array
    }
}
