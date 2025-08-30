package Leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class Rotting_Oranges {
    public int orangesRotting(int[][] grid) {
        // Khởi tạo đối tượng
        int m = grid.length, n = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();

        // lọc org tươi, thối lưu vào queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                }
            }
        }

        int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        int time = 0;

        // start BFS
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] dir : directions) {
                    int newCol = current[0] + dir[0];
                    int newRow = current[1] + dir[1];
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[] { newRow, newCol });
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }

    public static void main(String[] args) {
        Rotting_Oranges ro = new Rotting_Oranges();
        int[][] grid = { { 0, 2 } };
        System.out.println(ro.orangesRotting(grid));
    }
}
