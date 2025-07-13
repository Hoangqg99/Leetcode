package Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {
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

    // khởi tạo hàm
    private void collab(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            sb.append(node.val).append(",");
        } else {
            collab(node.left, sb);
            collab(node.right, sb);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        collab(root2, sb2);
        collab(root1, sb1);
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        Leaf_Similar_Trees outer = new Leaf_Similar_Trees();
        TreeNode root1 = outer.new TreeNode(1);
        root1.left = outer.new TreeNode(2);
        root1.right = outer.new TreeNode(3);
        // root1.left.left = outer.new TreeNode(4);
        // root1.left.right = outer.new TreeNode(5);

        TreeNode root2 = outer.new TreeNode(6);
        root2.left = outer.new TreeNode(7);
        root2.right = outer.new TreeNode(8);
        root2.left.left = outer.new TreeNode(9);
        root2.left.right = outer.new TreeNode(10);

        boolean result = outer.leafSimilar(root1, root2);
        System.out.println("Are the leaf sequences similar? " + result); // Output: false
    }
}
