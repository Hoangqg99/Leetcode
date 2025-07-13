package Leetcode75;

import Leetcode75.Maximum_Depth_of_Binary_Tree.Solution;

public class Count_Good_Nodes_in_Binary_Tree {

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

    private int min(TreeNode node, int max) {
        if (node == null)
            return 0;
        int good = node.val >= max ? 1 : 0;
        max = Math.max(max, node.val);
        return good + min(node.left, max) + min(node.right, max);
    }

    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        return min(root, Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        Count_Good_Nodes_in_Binary_Tree solution = new Count_Good_Nodes_in_Binary_Tree();
        TreeNode node1 = solution.new TreeNode(3);
        TreeNode node2 = solution.new TreeNode(1);
        TreeNode node3 = solution.new TreeNode(4);
        TreeNode node4 = solution.new TreeNode(3);
        TreeNode node5 = solution.new TreeNode(1);
        TreeNode node6 = solution.new TreeNode(5);
        // TreeNode node7 = solution.new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        // node3.right = node7;
        int result = solution.goodNodes(node1);
        System.out.println("Number of good nodes: " + result); // Output: 4

    }
}

// Solution solution = outer.new Solution();
// TreeNode root = outer.new TreeNode(1);