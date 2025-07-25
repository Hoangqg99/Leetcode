package Leetcode75;

public class Search_in_a_Binary_Search_Tree {
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

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        if (val < root.val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        Search_in_a_Binary_Search_Tree solution = new Search_in_a_Binary_Search_Tree();
        TreeNode root = solution.new TreeNode(4);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(7);
        root.left.left = solution.new TreeNode(1);
        root.left.right = solution.new TreeNode(3);
        int val = 2;
        TreeNode result = solution.searchBST(root, val);
        if (result != null)
            System.out.println(result.val);
    }
}
