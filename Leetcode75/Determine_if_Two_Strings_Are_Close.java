package Leetcode75;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Determine_if_Two_Strings_Are_Close {
    public boolean closeStrings(String word1, String word2) {
        // Kiểm tra độ dài của hai chuỗi
        if (word1.length() != word2.length())
            return false;

        // Tạo mảng kí tự a-z 26 kí tự
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Đếm số lần xuất hiện ký tự trong mảng
        for (char c : word1.toCharArray())
            count1[c - 'a']++;
        for (char c : word2.toCharArray())
            count2[c - 'a']++;

        // kiểm tra 2 chuỗi có cùng kí tự
        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0))
                return false;
        }

        // Sắp xếp tần suất rồi so sánh
        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {
        Determine_if_Two_Strings_Are_Close solution = new Determine_if_Two_Strings_Are_Close();
        String word1 = "abc";
        String word2 = "bca";
        boolean result = solution.closeStrings(word1, word2);
        System.out.println("result: " + result);

    }
}
