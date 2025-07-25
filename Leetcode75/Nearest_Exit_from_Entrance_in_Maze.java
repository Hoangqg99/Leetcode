package Leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class Nearest_Exit_from_Entrance_in_Maze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] direction : directions) {
                    int newRow = current[0] + direction[0];
                    int newCol = current[1] + direction[1];
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && maze[newRow][newCol] == '.') {
                        if (newRow == 0 || newRow == m - 1 || newCol == 0 || newCol == n - 1) {
                            return steps + 1;
                        }
                        maze[newRow][newCol] = '+';
                        queue.offer(new int[] { newRow, newCol });
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Nearest_Exit_from_Entrance_in_Maze s = new Nearest_Exit_from_Entrance_in_Maze();
        System.out.println(
                s.nearestExit(new char[][] { { '+', '+', '.', '+' }, { '.', '.', '.', '+' }, { '+', '+', '+', '.' } },
                        new int[] { 1, 2 }));
    }
}
