package Leetcode75;

public class Subarry_Sum_Equalsk {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Subarry_Sum_Equalsk solution = new Subarry_Sum_Equalsk();
        int[] nums = { 1, 1, 1 };
        int k = 1;
        System.out.println(solution.subarraySum(nums, k)); // Output: 2
    }
}
