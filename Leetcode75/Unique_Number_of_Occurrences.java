package Leetcode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freg = new HashMap<>();
        // đếm số lần xuất hiện
        for (int num : arr) {
            freg.put(num, freg.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        // ktra trung lặp số lần xuất hiện
        for (int count : freg.values()) {
            if (!set.add(count))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Unique_Number_of_Occurrences obj = new Unique_Number_of_Occurrences();
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        boolean result = obj.uniqueOccurrences(arr);
        System.out.println("result: " + result); // Output: true
    }
}
