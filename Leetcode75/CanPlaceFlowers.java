package Leetcode75;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1) || flowerbed[i + 1] == 0) {
                    flowerbed[i] = 0;
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers solution = new CanPlaceFlowers();
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int i = 0;
        boolean result = solution.canPlaceFlowers(flowerbed, i);
        System.out.println(result);
    }
}
