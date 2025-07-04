package Leetcode75;

import java.lang.reflect.Array;
import java.util.Stack;

public class Decode_String {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                strStack.push(curr);
                curr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder pre = strStack.pop();
                for (int i = 0; i < repeat; i++) {
                    pre.append(curr);
                }
                curr = pre;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }

    public static void main(String[] args) {
        Decode_String obj = new Decode_String();
        String s = "3[a]2[bc]";
        String result = obj.decodeString(s);
        System.out.println(result);
    }
}
