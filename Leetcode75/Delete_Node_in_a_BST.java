package Leetcode75;

public class Delete_Node_in_a_BST {
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

    public TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;
        else {
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }
        return root;
    }

    // [50,30,70,null,40,60,80]
    public static void main(String[] args) {
        Delete_Node_in_a_BST solution = new Delete_Node_in_a_BST();
        TreeNode root = solution.new TreeNode(50);
        root.left = solution.new TreeNode(30);
        root.right = solution.new TreeNode(70);
        root.left.right = solution.new TreeNode(40);
        root.right.left = solution.new TreeNode(60);
        root.right.right = solution.new TreeNode(80);
        int key = 50;
        TreeNode result = solution.deleteNode(root, key);
        if (result != null)
            System.out.println(result.val); // Output the root value after deletion
    }
}
