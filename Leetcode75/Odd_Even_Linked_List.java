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

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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
        Odd_Even_Linked_List solution = new Odd_Even_Linked_List();
        int[] s = { 2, 1, 3, 5, 6, 4, 7 };
        ListNode head = new ListNode(s[0]);
        ListNode temp = head;
        for (int i = 1; i < s.length; i++) {
            temp.next = new ListNode(s[i]);
            temp = temp.next;
        }

        System.out.print("Before: ");
        printList(head);

        ListNode result = solution.oddEvenList(head);

        System.out.print("After:  ");
        printList(result);
    }
}
