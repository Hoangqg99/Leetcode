package Leetcode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_the_Difference_of_Two_Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1)
            set1.add(num);
        for (int num : nums2)
            set2.add(num);

        List<Integer> only1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num))
                only1.add(num);
        }

        List<Integer> only2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num))
                only2.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(only1);
        result.add(only2);
        return result;
    }

    public static void main(String[] args) {
        Find_the_Difference_of_Two_Arrays obj = new Find_the_Difference_of_Two_Arrays();
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        List<List<Integer>> result = new ArrayList<>();
        result = obj.findDifference(nums1, nums2);
        System.out.println("result: " + result);
    }
}
