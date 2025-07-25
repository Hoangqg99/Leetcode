package Leetcode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.*;

public class Evaluate_Division {

    static class Solution {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            // Build graph
            for (int i = 0; i < equations.size(); i++) {
                String a = equations.get(i).get(0);
                String b = equations.get(i).get(1);
                double value = values[i];

                graph.putIfAbsent(a, new HashMap<>());
                graph.putIfAbsent(b, new HashMap<>());
                graph.get(a).put(b, value);
                graph.get(b).put(a, 1.0 / value);
            }

            double[] result = new double[queries.size()];
            for (int i = 0; i < queries.size(); i++) {
                String start = queries.get(i).get(0);
                String end = queries.get(i).get(1);
                Set<String> visited = new HashSet<>();
                result[i] = dfs(start, end, visited);
            }

            return result;
        }

        private double dfs(String current, String target, Set<String> visited) {
            if (!graph.containsKey(current) || !graph.containsKey(target))
                return -1.0;
            if (current.equals(target))
                return 1.0;

            visited.add(current);

            for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
                String next = neighbor.getKey();
                double value = neighbor.getValue();
                if (!visited.contains(next)) {
                    double res = dfs(next, target, visited);
                    if (res != -1.0)
                        return res * value;
                }
            }

            return -1.0;
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        List<List<String>> equations = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c"));

        double[] values = { 2.0, 3.0 };

        List<List<String>> queries = Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a"),
                Arrays.asList("x", "x"));

        double[] results = sol.calcEquation(equations, values, queries);

        System.out.println("Results:");
        for (double r : results) {
            System.out.println(r);
        }
    }
}
