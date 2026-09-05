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
    public ListNode mergeKLists(ListNode[] lists) {

        // minHeap, 
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>( (a,b) -> a.getKey() - b.getKey());
        
        //initialize with the first value of each list
        for(int i = 0; i < lists.length; i++) {

            //if empty, skip
            if(lists[i] == null) {
                continue;
            }

            //add first list val, which list its from --> increment head
            pq.offer(Map.entry(lists[i].val, i));
        }


        ListNode res = new ListNode(0);
        ListNode dummy = res;

        //while heap non empty, poll the top, add to list, add the next vl to heap, increment where we added from
        while(!pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();

            int val = entry.getKey();
            int idx = entry.getValue();
            
            dummy.next = new ListNode(val);
            dummy = dummy.next;

            lists[idx] = lists[idx].next;
            if(lists[idx] != null) {
                pq.offer(Map.entry(lists[idx].val, idx));
            }

        }

        return res.next;

    }

    /*

        heap<Map.Entry<Val, List>> pq

        push to heap w source list

        pop, populate from source list

        loop while !pq.isEmpty();

    */
}
