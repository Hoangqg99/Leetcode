package Leetcode75;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        longestCommonPrefix solution = new longestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
