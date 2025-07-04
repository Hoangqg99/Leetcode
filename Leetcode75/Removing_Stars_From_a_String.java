package Leetcode75;

import java.util.Stack;

public class Removing_Stars_From_a_String {
    public String removeStars(String s) {

        // Stack<Character> stack = new Stack<>();
        // for (char c : s.toCharArray()) {
        // if (c != '*') {
        // stack.push(c);
        // } else if (!stack.isEmpty()) {
        // stack.pop();
        // }
        // }

        // StringBuilder result = new StringBuilder();
        // while (!stack.isEmpty()) {
        // result.append(stack.pop());
        // }
        // return result.reverse().toString();

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Removing_Stars_From_a_String solution = new Removing_Stars_From_a_String();
        String s = "leet**cod*e";
        String result = solution.removeStars(s);
        System.out.println("result: " + result);
    }
}
