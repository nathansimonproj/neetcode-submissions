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

        // two pointers, push one n in front, when end drop the nth

        ListNode dummy = new ListNode(0, head);
        
        ListNode s = dummy; 
        ListNode f = head;
        
        while(n > 0) {
            f = f.next;
            n--;
        }

        while(f != null) {
            s = s.next;
            f = f.next;
        }

        s.next = s.next.next;
        return dummy.next;
    }
}
