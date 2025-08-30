package Leetcode75;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // for (int num : nums) {
        // minHeap.offer(num);
        // if (minHeap.size() > k)
        // minHeap.poll();
        // }
        // return minHeap.peek();

        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);
    }

    public int quickSelect(int[] nums, int left, int right, int kSmallest) {
        if (left == right)
            return nums[left];
        int pivotIndex = partition(nums, left, right);
        if (pivotIndex == kSmallest)
            return nums[pivotIndex];
        else if (pivotIndex < kSmallest)
            return quickSelect(nums, pivotIndex + 1, right, kSmallest);
        else
            return quickSelect(nums, left, pivotIndex - 1, kSmallest);
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot)
                swap(nums, storeIndex++, i);
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Kth_Largest_Element_in_an_Array solution = new Kth_Largest_Element_in_an_Array();
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;
        int result = solution.findKthLargest(nums, k);
        System.out.println("result: " + result);
    }
}
