package Leetcode75;

public class Path_Sum_PathSumIII {
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

    // private int sub(TreeNode node, int targetSum) {
    // if (node == null)
    // return 0;
    // int sub = 0;
    // if (node.val == targetSum)
    // sub++;
    // sub += sub(node.left, targetSum - node.val);
    // sub += sub(node.right, targetSum - node.val);
    // return sub;
    // }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        Path_Sum_PathSumIII outer = new Path_Sum_PathSumIII();
        TreeNode root = outer.new TreeNode(5);
        root.left = outer.new TreeNode(4);
        root.right = outer.new TreeNode(8);
        root.left.left = outer.new TreeNode(11);
        root.left.left.left = outer.new TreeNode(7);
        root.left.left.right = outer.new TreeNode(2);
        root.right.left = outer.new TreeNode(13);
        root.right.right = outer.new TreeNode(4);
        root.right.right.right = outer.new TreeNode(1);

        int targetSum = 22;
        boolean result = outer.hasPathSum(root, targetSum);
        System.out.println("Has path sum " + targetSum + ": " + result);
    }
}
