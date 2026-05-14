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
    public void reorderList(ListNode head) {
        
        // reverse back half of list
        ListNode s = head;
        ListNode f = head.next;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        //split
        ListNode second = s.next;
        ListNode prev = s.next = null;

        //reverse
        while(second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        ListNode first = head;
        second = prev;

        while(second != null) {
            //preserve link
            ListNode tmpFirst = first.next;
            ListNode tmpSecond = second.next;

            first.next = second;
            second.next = tmpFirst;

            first = tmpFirst;
            second = tmpSecond;
        }

        // merge front and back
    }
}
