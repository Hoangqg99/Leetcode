package Leetcode75;

public class MinimumAdditionstoMakeValidString {
    public int addMinimum(String word) {

        int res = 0, i = 0;

        while (i < word.length()) {
            if (word.charAt(i) == 'a') {
                if (i + 1 < word.length() && word.charAt(i + 1) == 'b') {
                    i++;
                    if (i + 1 < word.length() && word.charAt(i + 1) == 'c') {
                        i++;
                    } else {
                        res++;
                    }
                } else {
                    res += 2;
                }
            }

            else if (word.charAt(i) == 'b') {
                res++;
                if (i + 1 < word.length() && word.charAt(i + 1) == 'c') {
                    i++;
                } else {
                    res++;
                }
            }

            else if (word.charAt(i) == 'c') {
                res += 2;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        MinimumAdditionstoMakeValidString solution = new MinimumAdditionstoMakeValidString();
        // String word = "b";
        System.out.println(solution.addMinimum("b"));

    }
}
