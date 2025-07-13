package Leetcode75;

public class Maximum_Depth_of_Binary_Tree {
    class TreeNode {
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

    class Solution {
        public int maxDepth(TreeNode root) {
            // if (root == null)
            // return 0;
            // int left = maxDepth(root.left);
            // int right = maxDepth(root.right);
            // return 1 + Math.max(left, right);
            if (root == null)
                return 0;
            int left = maxDepth(root.left);
            int rigt = maxDepth(root.right);
            return 1 + Math.max(left, rigt);
        }

    }

    public static void main(String[] args) {
        Maximum_Depth_of_Binary_Tree outer = new Maximum_Depth_of_Binary_Tree();
        Solution solution = outer.new Solution();
        TreeNode root = outer.new TreeNode(1);
        root.left = outer.new TreeNode(2);
        root.right = outer.new TreeNode(3);
        root.left.left = outer.new TreeNode(4);
        root.left.right = outer.new TreeNode(5);
        int depth = solution.maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: " + depth); // Output: 3
    }
}