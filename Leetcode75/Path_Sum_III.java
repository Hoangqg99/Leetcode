package Leetcode75;

import java.util.HashMap;
import java.util.Map;

public class Path_Sum_III {
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

    // private int sub(TreeNode node, Long targrtSum) {
    // if (node == null)
    // return 0;
    // int sub = 0;
    // if (node.val == targrtSum)
    // sub++;
    // sub += sub(node.left, targrtSum - node.val);
    // sub += sub(node.right, targrtSum - node.val);
    // return sub;
    // }

    // public int pathSum(TreeNode root, int targetSum) {
    // if (root == null)
    // return 0;
    // return sub(root, (long) targetSum) + pathSum(root.left, targetSum) +
    // pathSum(root.right, targetSum);
    // }

    private int sub(TreeNode node, Long targrtSum) {
        if (node == null)
            return 0;
        int count = 0;
        if (node.val == targrtSum)
            count++;
        count += sub(node.left, targrtSum - node.val);
        count += sub(node.right, targrtSum - node.val);
        return count;
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        return sub(root, (long) targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    // 10,5,-3,3,2,null,11,3,-2,null,1
    // [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]
    public static void main(String[] args) {
        Path_Sum_III outer = new Path_Sum_III();
        TreeNode root = outer.new TreeNode(1000000000);
        root.left = outer.new TreeNode(1000000000);
        root.right = outer.new TreeNode(294967296);
        root.left.left = outer.new TreeNode(1000000000);
        root.left.right = outer.new TreeNode(1000000000);
        root.right.right = outer.new TreeNode(1000000000);
        // root.left.left.left = outer.new TreeNode(3);
        // root.left.left.right = outer.new TreeNode(-2);
        // root.left.right.right = outer.new TreeNode(1);

        int targetSum = 8;
        int result = outer.pathSum(root, targetSum);
        System.out.println("Number of paths with sum " + targetSum + ": " + result);
        // Output: 3
    }

}
