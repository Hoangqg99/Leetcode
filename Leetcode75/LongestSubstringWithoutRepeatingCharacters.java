package Leetcode75;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (charIndex[currentChar] > left) {
                left = charIndex[currentChar];
            }
            charIndex[currentChar] = right + 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // public static void main(String[] args) {
    // LongestSubstringWithoutRepeatingCharacters solution = new
    // LongestSubstringWithoutRepeatingCharacters();
    // String testString = "abcabcbb";
    // int result = solution.lengthOfLongestSubstring(testString);
    // System.out.println("Length of the longest substring without repeating
    // characters: " + result);
    // }

}
