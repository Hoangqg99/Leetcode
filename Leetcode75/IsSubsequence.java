package Leetcode75;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        char[] starr = s.toCharArray();
        char[] tarr = t.toCharArray();
        while (i < starr.length && j < tarr.length) {
            if (starr[i] == tarr[j]) {
                i++;
            }
            j++;
        }
        return i >= starr.length;
    }

    public static void main(String[] args) {
        IsSubsequence obj = new IsSubsequence();
        String s = "abc";
        String t = "ahbgdc";
        Boolean result = obj.isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\": " +
                result);
    }

}
