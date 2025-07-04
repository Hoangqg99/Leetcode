package Leetcode75;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        // String[] words = s.trim().split("\\s+");
        // StringBuilder sb = new StringBuilder();

        // for (int i = words.length - 1; i >= 0; i--) {
        // sb.append(words[i]);
        // if (i > 0) sb.append(" ");
        // }

        // return sb.toString();

        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWordsinaString solution = new ReverseWordsinaString();
        String input = "  Hello World  ";
        String input_1 = " this is sk y ";
        String output = solution.reverseWords(input);
        String output_1 = solution.reverseWords(input_1);

        System.out.println("Reversed words: '" + output + "'" + output_1); // Output: "World Hello"
    }
    // public static void main(String[] args) {
    // ReverseWordsinaString solution = new ReverseWordsinaString();
    // String testSting = " hello world ";
    // String result = solution.reverseVowels(testSting);
    // System.out.println("result = " + result);
    // }

}
