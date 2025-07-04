package Leetcode75;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left[i] = nums[i];
            } else {
                left[i] = left[i - 1] * nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                right[i] = nums[i];
            } else {
                right[i] = right[i + 1] * nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = right[i + 1];
            } else if (i == nums.length - 1) {
                result[i] = left[i - 1];
            } else {
                result[i] = left[i - 1] * right[i + 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = obj.productExceptSelf(nums);
        for (int num : result) {
            System.out.println("" + num);
        }
    }
}
