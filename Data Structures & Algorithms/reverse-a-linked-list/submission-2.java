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

            preserve the link, link to prev, set prev to sublist, set head to preserved link

        */

        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next; //preserve the link

            head.next = prev; //link to prev

            prev = head;

            head = next;
        }

        return prev;
    }
}
