package Leetcode75;

public class Populating_Next_Right_Pointers_in_Each_Node {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public void collab(Node node, Node next) {
        if (node == null)
            return;
        node.next = next;
        collab(node.left, next);
        collab(node.right, next);
        if (next != null) {
            collab(node.left, node.right);
            collab(node.right, next.left);
        } else {
            collab(node.left, null);
            collab(node.right, null);
        }

    }

    public Node connect(Node root) {
        if (root == null)
            return null;
        collab(root, null);
        return root;
    }

    public static void main(String[] args) {
        Populating_Next_Right_Pointers_in_Each_Node solution = new Populating_Next_Right_Pointers_in_Each_Node();
        Node root = solution.new Node(1);
        root.left = solution.new Node(2);
        root.right = solution.new Node(3);
        root.left.left = solution.new Node(4);
        root.left.right = solution.new Node(5);
        root.right.right = solution.new Node(6);

        solution.connect(root);

        // Print the next pointers for each node
        System.out.println("Node 1 next: " + (root.next != null ? root.next.val : "null"));
        System.out.println("Node 2 next: " + (root.left.next != null ? root.left.next.val : "null"));
        System.out.println("Node 3 next: " + (root.right.next != null ? root.right.next.val : "null"));
    }
}
