package Leetcode75;

import java.nio.file.WatchEvent;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int arean = h * w;
            maxArea = Math.max(maxArea, arean);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = obj.maxArea(height);
        System.out.println("maxArea: " + result);
    }
}
