package Leetcode75;

public class Count_Special_Quadruplets {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Count_Special_Quadruplets solution = new Count_Special_Quadruplets();
        int[] nums = { 1, 2, 3, 4 };
        int result = solution.countQuadruplets(nums);
        System.out.println(result);
    }
}
