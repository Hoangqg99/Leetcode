package Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero {
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] conn : connections) {
            int from = conn[0];
            int to = conn[1];
            graph.get(from).add(new int[] { to, 1 });
            graph.get(to).add(new int[] { from, 0 });
        }
        boolean[] visited = new boolean[n];
        return dfs(0, graph, visited);
    }

    private int dfs(int node, List<List<int[]>> graph, boolean[] visited) {
        visited[node] = true;
        int change = 0;
        for (int[] neighbor : graph.get(node)) {
            int next = neighbor[0];
            int direction = neighbor[1];
            if (!visited[next]) {
                change += direction;
                change += dfs(next, graph, visited);
            }
        }
        return change;
    }

    public static void main(String[] args) {
        Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero solution = new Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero();
        int[][] connections = {
                { 0, 1 },
                { 1, 3 },
                { 2, 3 },
                { 4, 0 },
                { 4, 5 }
        };
        int result = solution.minReorder(6, connections);
        System.out.println(result);
        ;
    }
}
