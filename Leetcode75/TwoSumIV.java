package Leetcode75;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIV {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> s = new HashSet<>();
        return find(root, k, s);
    }

    public boolean find(TreeNode root, int k, Set<Integer> s) {
        if (root == null)
            return false;
        if (s.contains(k - root.val))
            return true;
        s.add(root.val);
        return find(root.left, k, s) || find(root.right, k, s);
    }

    public static void main(String[] args) {
        TwoSumIV tree = new TwoSumIV();
        TreeNode root = tree.new TreeNode(5);
        root.left = tree.new TreeNode(3);
        root.right = tree.new TreeNode(6);
        root.left.left = tree.new TreeNode(2);
        root.left.right = tree.new TreeNode(4);
        root.right.right = tree.new TreeNode(7);

        System.out.println(tree.findTarget(root, 9)); // Output: true
        System.out.println(tree.findTarget(root, 28)); // Output: false
    }
}
