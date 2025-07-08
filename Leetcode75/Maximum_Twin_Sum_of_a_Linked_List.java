package Leetcode75;

public class Maximum_Twin_Sum_of_a_Linked_List {
    public class ListNode {
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

    public int pairSum(ListNode head) {
        if (head == null || head.next == null)
            return 0;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Đảo ngược danh sách từ giữa đến cuối
        // prev sẽ là đầu của danh sách đảo ngược
        ListNode prev = null, cur = slow;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }

        int maxSum = 0;
        ListNode firListNode = head;
        ListNode secListNode = prev;
        while (secListNode != null) {
            maxSum = Math.max(maxSum, firListNode.val + secListNode.val);
            firListNode = firListNode.next;
            secListNode = secListNode.next;
        }
        return maxSum;
    }
}
