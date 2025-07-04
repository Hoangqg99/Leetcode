package Leetcode75;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        // if (head == null || head.next == null)
        // return null;

        // int count = 0;
        // ListNode temp = head;
        // while (temp != null) {
        // count++;
        // temp = temp.next;
        // }

        // int mid = count / 2;
        // temp = head;
        // for (int i = 0; i < mid - 1; i++) {
        // temp = temp.next;
        // }

        // temp.next = temp.next.next;

        // return head;

        if (head == null || head.next == null)
            return null;

        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Delete_the_Middle_Node_of_a_Linked_List solution = new Delete_the_Middle_Node_of_a_Linked_List();
        int[] s = { 1, 3, 4, 7, 1, 2, 6 };
        ListNode head = new ListNode(s[0]);
        ListNode temp = head;
        for (int i = 1; i < s.length; i++) {
            temp.next = new ListNode(s[i]);
            temp = temp.next;
        }

        System.out.print("Before: ");
        printList(head);

        ListNode result = solution.deleteMiddle(head);

        System.out.print("After:  ");
        printList(result);
    }

}
