package Leetcode75;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = { 0, 1, 0, 3, 12 };
        obj.moveZeroes(nums);

        for (int num : nums) {
            System.out.println(num + " ");
        }
    }

}
