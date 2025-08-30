package Leetcode75;

import java.util.Arrays;

public class Twosum2inputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // Return 1-based indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 }; // If no solution found
    }

    public static void main(String[] args) {
        Twosum2inputArrayIsSorted solution = new Twosum2inputArrayIsSorted();
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
