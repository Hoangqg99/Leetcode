package Leetcode75;

public class Find_Pivot_Index {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        Find_Pivot_Index obj = new Find_Pivot_Index();
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println("result: " + obj.pivotIndex(nums));
    }
}
