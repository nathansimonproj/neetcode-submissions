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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode dummy = head;

        while(list1 != null || list2 != null) {
            //handle the case that either could be null
            if(list1 == null) {
                
                while(list2 != null) {
                    dummy.next = new ListNode(list2.val);
                    list2 = list2.next;
                    dummy = dummy.next;
                }

                return head.next;
            }
            
            else if(list2 == null) {

                while(list1 != null) {
                    dummy.next = new ListNode(list1.val);
                    list1 = list1.next;
                    dummy = dummy.next;
                }

                return head.next;
            }

            else {
                
                int val = 0;
                if(list1.val <= list2.val) {
                    val = list1.val;
                    list1 = list1.next;
                }
                else {
                    val = list2.val;
                    list2 = list2.next;
                }
                dummy.next = new ListNode(val);
            }

            dummy = dummy.next;
        }

        return head.next;
    }
}