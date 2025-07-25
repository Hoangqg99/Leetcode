package Leetcode75;

public class Number_of_Provinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provices = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                provices++;
            }
        }
        return provices;
    }

    public void dfs(int city, int[][] isConnected, boolean[] visited) {
        visited[city] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[city][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }

    public static void main(String[] args) {
        Number_of_Provinces solution = new Number_of_Provinces();
        int[][] isConnected = {
                { 1, 1, 0 },
                { 1, 1, 0 },
                { 0, 0, 1 }
        };
        int result = solution.findCircleNum(isConnected);
        System.out.println(result); // Output: 2
    }
}
