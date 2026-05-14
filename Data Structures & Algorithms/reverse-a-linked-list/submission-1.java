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
    public ListNode reverseList(ListNode head) {

        /*
            Preserve the link, link head to prev, make prev the sublist, make next the preserved link
        */

        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next; //preserve the link

            head.next = prev; //link to prev, break the link
            prev = head; //new sublist

            head = next;

        }

        return prev;
        
    }
}
