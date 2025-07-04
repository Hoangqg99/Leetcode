package Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies = 0;
        // for (int candy = 0; candy < candies.length; candy++) {
        for (int candy : candies) {
            if (candies[candy] > max_candies) {
                max_candies = Math.max(max_candies, candy);
            }
        }
        List<Boolean> result = new ArrayList<>();
        // for (int candy = 0; candy < candies.length; candy++) {
        for (int candy : candies) {
            if (candy + extraCandies >= max_candies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        KidsWiththeGreatestNumberofCandies solution = new KidsWiththeGreatestNumberofCandies();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
