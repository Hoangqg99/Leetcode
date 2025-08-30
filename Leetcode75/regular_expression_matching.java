package Leetcode75;

public class regular_expression_matching {
    public boolean isMatch(String s, String p) {
        return isMatchHelper(s, p, 0, 0);
    }

    private boolean isMatchHelper(String s, String p, int i, int j) {
        if (j == p.length())
            return i == s.length();
        boolean firstMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            return (firstMatch && isMatchHelper(s, p, i + 1, j)) || isMatchHelper(s, p, i, j + 2);
        }
        return firstMatch && isMatchHelper(s, p, i + 1, j + 1);
    }

    public static void main(String[] args) {
        regular_expression_matching rem = new regular_expression_matching();
        System.out.println(rem.isMatch("aab", "c*a*b")); // true
        System.out.println(rem.isMatch("mississippi", "mis*is*p*.")); // false
    }
}
