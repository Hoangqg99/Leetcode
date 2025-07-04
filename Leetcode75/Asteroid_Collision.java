package Leetcode75;

import java.util.Arrays;
import java.util.Stack;
import java.util.*;

public class Asteroid_Collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -asteroid) {
                    stack.pop(); // Asteroid bên phải nhỏ hơn → nổ
                } else if (top == -asteroid) {
                    stack.pop(); // Cả hai bằng nhau → cùng nổ
                    destroyed = true;
                    break;
                } else {
                    // Asteroid hiện tại nhỏ hơn → nổ
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Asteroid_Collision solution = new Asteroid_Collision();
        int[] asteroids = { 8, -8 };
        int[] result = solution.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }
}
