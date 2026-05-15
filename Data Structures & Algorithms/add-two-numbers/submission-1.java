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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // loop through l1/l2

        // add nums, carry over if more than 10

        ListNode res = new ListNode();
        ListNode head = res;

        boolean carryOver = false;
        while(l1 != null || l2 != null) {

            int curr = 0;
            if(l1 == null) {
                curr = l2.val;
                l2 = l2.next;
            }

            else if(l2 == null) {
                curr = l1.val;
                l1 = l1.next;
            }

            else {
                curr = l1.val + l2.val;

                l1 = l1.next;
                l2 = l2.next;
                
            }

            if(carryOver) {
                curr++;
                carryOver = false;
            }
            if(curr >= 10) {
                curr -= 10;
                carryOver = true;
            }



            head.next = new ListNode(curr);
            head = head.next;

        }

        if(carryOver) {
            head.next = new ListNode(1);
        }

        return res.next;
    }
}
