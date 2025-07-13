package Leetcode75;

public class Longest_ZigZag_Path_in_a_Binary_Tree {
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

    private int maxZZagLength = 0;

    // public int search(TreeNode node, int length, boolean isleft) {
    // if (node == null)
    // return maxZZagLength;
    // maxZZagLength = Math.max(maxZZagLength, length);
    // if (isleft) {
    // search(node.right, length + 1, false);
    // search(node.left, 1, true);
    // } else {
    // search(node.left, length + 1, true);
    // search(node.right, 1, false);
    // }
    // return maxZZagLength;
    // }

    // public int longestZigZag(TreeNode root) {
    // search(root.right, 0, false);
    // search(root.left, 0, true);
    // return maxZZagLength;
    // }

    public int longestZigZag(TreeNode root) {
        search(root.left, 0, true);
        search(root.right, 0, false);
        return maxZZagLength;
    }

    private void search(TreeNode node, int length, boolean isleft) {
        if (node == null)
            return;
        maxZZagLength = Math.max(maxZZagLength, length);
        if (isleft) {
            search(node.right, length + 1, isleft);
            search(node.left, 1, true);
        } else {
            search(node.left, length + 1, true);
            search(node.right, 1, false);
        }
    }

    public static void main(String[] args) {
        Longest_ZigZag_Path_in_a_Binary_Tree outer = new Longest_ZigZag_Path_in_a_Binary_Tree();
        TreeNode root = outer.new TreeNode(1);
        root.left = outer.new TreeNode(1);
        root.left.left = outer.new TreeNode(1);
        root.left.right = outer.new TreeNode(1);
        root.left.right.right = outer.new TreeNode(1);
        root.left.left = outer.new TreeNode(1);
        root.left.left.right = outer.new TreeNode(1);
        root.left.left.right.right = outer.new TreeNode(1);

        int result = outer.longestZigZag(root);
        System.out.println("result: " + result);
    }
}
