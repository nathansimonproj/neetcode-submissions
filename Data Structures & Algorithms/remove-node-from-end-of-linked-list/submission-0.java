/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*
            two pointers, one is n - 1 positions ahead of front
        */

        ListNode dummy = new ListNode(0, head);
        ListNode l = dummy;
        ListNode right = head;

        //loop until right is exactly n ahead of left
        while(n > 0) {
            right = right.next;
            n--;
        }

        while(right != null) {
            l = l.next;
            right = right.next;
        }

        l.next = l.next.next;
        return dummy.next;


    }
}
