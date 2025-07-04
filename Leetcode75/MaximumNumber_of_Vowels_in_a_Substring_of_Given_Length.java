package Leetcode75;

public class MaximumNumber_of_Vowels_in_a_Substring_of_Given_Length {

    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
            if (maxCount == k) {
                return k;
            }
        }
        return maxCount;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        MaximumNumber_of_Vowels_in_a_Substring_of_Given_Length obj = new MaximumNumber_of_Vowels_in_a_Substring_of_Given_Length();
        String s = "weallloveyou";
        int k = 7;
        int result = obj.maxVowels(s, k);
        System.out.println("result: " + result);
    }
}
