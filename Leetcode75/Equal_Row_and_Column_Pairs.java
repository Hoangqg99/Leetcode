package Leetcode75;

import java.util.HashMap;
import java.util.Map;

public class Equal_Row_and_Column_Pairs {
    // public int equalPairs(int[][] grid) {
    // int n = grid.length;
    // int count = 0;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // boolean isEqual = true;
    // for (int k = 0; k < n; k++) {
    // if (grid[i][k] != grid[k][j]) {
    // isEqual = false;
    // break;
    // }
    // }
    // if (isEqual) {
    // count++;
    // }
    // }
    // }
    // return count;

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

        // Bước 1: lưu tất cả hàng dưới dạng chuỗi vào map
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append("#");
            }
            String rowStr = sb.toString();
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        // Bước 2: kiểm tra từng cột có trùng với hàng nào không
        int count = 0;
        for (int col = 0; col < n; col++) {
            StringBuilder sb = new StringBuilder();
            for (int row = 0; row < n; row++) {
                sb.append(grid[row][col]).append("#");
            }
            String colStr = sb.toString();
            count += rowMap.getOrDefault(colStr, 0);
        }

        return count;

    }

    public static void main(String[] args) {
        Equal_Row_and_Column_Pairs solution = new Equal_Row_and_Column_Pairs();
        int[][] grid = {
                { 3, 2, 1 },
                { 1, 7, 6 },
                { 2, 7, 7 }
        };
        int result = solution.equalPairs(grid);
        System.out.println("Number of equal row and column pairs: " + result);
    }
}
