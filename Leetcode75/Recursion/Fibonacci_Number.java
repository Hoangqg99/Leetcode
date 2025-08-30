package Leetcode75.Recursion;

public class Fibonacci_Number {
    // public int fib(int n) {
    // if (n <= 1) {
    // return n;
    // }
    // return fib(n - 1) + fib(n - 2);
    // }

    public int fibIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibonacci_Number fn = new Fibonacci_Number();
        int n = 5;
        System.out.println(fn.fibIterative(n));
    }
}
