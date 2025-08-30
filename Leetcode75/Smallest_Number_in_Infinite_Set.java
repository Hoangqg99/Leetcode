package Leetcode75;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Smallest_Number_in_Infinite_Set {
    private PriorityQueue<Integer> minHeap;
    private Set<Integer> set;
    private int current;

    public Smallest_Number_in_Infinite_Set() {
        minHeap = new PriorityQueue<>();
        set = new HashSet<>();
        current = 1;
    }

    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            int smallest = minHeap.poll();
            set.remove(smallest);
            return smallest;
        }
        return current++;
    }

    public void addBack(int num) {
        if (num < current && !set.contains(num)) {
            minHeap.offer(num);
            set.add(num);
        }
    }

    public static void main(String[] args) {
        Smallest_Number_in_Infinite_Set solution = new Smallest_Number_in_Infinite_Set();
        System.out.println(solution.popSmallest()); // Output: 1
        solution.addBack(2);
        System.out.println(solution.popSmallest()); // Output: 2
        // solution.addBack(1);
        // System.out.println(solution.popSmallest()); // Output: 1
        // System.out.println(solution.popSmallest()); // Output: 3
        // solution.addBack(3);
        // System.out.println(solution.popSmallest()); // Output: 3
        // solution.addBack(4);
        // System.out.println(solution.popSmallest()); // Output: 4
        // solution.addBack(5);
        // System.out.println(solution.popSmallest()); // Output: 5
        // solution.addBack(6);
        // System.out.println(solution.popSmallest()); // Output: 6
        // solution.addBack(7);
        // System.out.println(solution.popSmallest()); // Output: 7
    }
}
