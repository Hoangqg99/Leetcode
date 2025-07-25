package Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Level_Sum_of_a_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void collab(TreeNode node, int depth, List<Integer> result) {
        if (node == null)
            return;
        if (depth == result.size())
            result.add(node.val);
        else
            result.set(depth, result.get(depth) + node.val);
        collab(node.left, depth + 1, result);
        collab(node.right, depth + 1, result);
    }

    public int maxLevelSum(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return 0;
        collab(root, 0, result);
        int maxLevelSum = Integer.MIN_VALUE;
        int maxlevel = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) > maxLevelSum) {
                maxLevelSum = result.get(i);
                maxlevel = i + 1;
            }
        }
        return maxlevel;
    }

    // [1,7,0,7,-8,null,null]
    public static void main(String[] args) {
        Maximum_Level_Sum_of_a_Binary_Tree solution = new Maximum_Level_Sum_of_a_Binary_Tree();
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(7);
        root.right = solution.new TreeNode(0);
        root.left.left = solution.new TreeNode(7);
        root.left.right = solution.new TreeNode(-8);
        int maxLevel = solution.maxLevelSum(root);
        System.out.println(maxLevel); // Output: 2
    }
}
