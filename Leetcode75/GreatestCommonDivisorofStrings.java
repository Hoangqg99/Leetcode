package Leetcode75;

public class GreatestCommonDivisorofStrings {
    public String gcOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str1 + str2)) {
            return "";
        }

        int lengcd = gcd(str1.length(), str2.length());
        return str1.substring(0, lengcd);
    }

    private int gcd(int len1, int len2) {
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }
}