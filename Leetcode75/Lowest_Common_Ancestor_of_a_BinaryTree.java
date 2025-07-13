package Leetcode75;

public class Lowest_Common_Ancestor_of_a_BinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if (root == null || root == p || root == q)
        // return root;
        // TreeNode left = lowestCommonAncestor(root.left, p, q);
        // TreeNode right = lowestCommonAncestor(root.right, p, q);
        // if (left != null && right != null)
        // return root;
        // return left != null ? left : right;
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null)
            return root;
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        Lowest_Common_Ancestor_of_a_BinaryTree solution = new Lowest_Common_Ancestor_of_a_BinaryTree();
        TreeNode root = solution.new TreeNode(3);
        TreeNode p = solution.new TreeNode(5);
        TreeNode q = solution.new TreeNode(1);
        TreeNode left = solution.new TreeNode(6);
        TreeNode right = solution.new TreeNode(2);
        TreeNode leftChild = solution.new TreeNode(7);
        TreeNode rightChild = solution.new TreeNode(4);
        root.left = p;
        root.right = q;
        p.left = left;
        p.right = right;
        right.left = leftChild;
        right.right = rightChild;
        q.left = solution.new TreeNode(0);
        q.right = solution.new TreeNode(8);
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(
                "Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + (lca != null ? lca.val : "null"));

    }
}
