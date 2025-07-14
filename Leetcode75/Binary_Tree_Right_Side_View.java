package Leetcode75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Right_Side_View {
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
        collab(node.right, depth + 1, result);
        collab(node.left, depth + 1, result);
        return;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        collab(root, 0, result);
        return result;
    }

    public static void main(String[] args) {
        Binary_Tree_Right_Side_View solution = new Binary_Tree_Right_Side_View();
        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.right = solution.new TreeNode(3);
        root.right.right.right = solution.new TreeNode(4);

        List<Integer> rightView = solution.rightSideView(root);
        System.out.println(rightView); // Output: [1, 2, 3, 4]
    }
}
