package Leetcode75;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        // if (nums.length < 3) {
        // return false;
        // }
        // int first = Integer.MAX_VALUE;
        // int second = Integer.MAX_VALUE;

        // for (int num : nums) {
        // if (num <= first) {
        // first = num;
        // } else if (num <= second) {
        // second = num;
        // } else {
        // return true;
        // }

        // }
        // return false;
        if (nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num < second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        IncreasingTripletSubsequence obj = new IncreasingTripletSubsequence();
        int[] nums = { 1, 2, 3, 4, 5 };
        boolean result = obj.increasingTriplet(nums);
        System.out.println("Does the array contain an increasing triplet? " + result);

        int[] nums2 = { 5, 4, 3, 2, 1 };
        boolean result2 = obj.increasingTriplet(nums2);
        System.out.println("Does the array contain an increasing triplet? " + result2);
    }
}
