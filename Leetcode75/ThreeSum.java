package Leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }
}
