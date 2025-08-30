package Leetcode75.Recursion;

import java.util.List;

public class Swap_Nodes_in_Pairs {
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

    public void swapPairsHelper(ListNode prev, ListNode curr) {
        if (curr == null || curr.next == null)
            return;
        ListNode nextPair = curr.next.next;
        curr.next.next = curr;
        curr.next = nextPair;
        swapPairsHelper(curr, nextPair);
    }

    public ListNode swapPairs(ListNode head) {

        swapPairsHelper(new ListNode(-1, head), head);
        return head;

        // if (head == null || head.next == null) {
        // return head;
        // }

        // ListNode s = head.next;
        // ListNode f = head.next.next;
        // s.next = head;
        // head.next = swapPairs(f);
        // return s;

        // dummny
        // ListNode dummy = new ListNode(-1);
        // dummy.next = head;
        // ListNode p = dummy;
        // while (head != null && head.next != null) {
        // // swap
        // ListNode f = head, s = head.next;
        // f.next = s.next;
        // s.next = f;
        // p.next = s;
        // p = f;
        // head = f.next;
        // }

        // return dummy.next;

    }

    public static void main(String[] args) {
        Swap_Nodes_in_Pairs solution = new Swap_Nodes_in_Pairs();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        ListNode newHead = solution.swapPairs(head);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

}
