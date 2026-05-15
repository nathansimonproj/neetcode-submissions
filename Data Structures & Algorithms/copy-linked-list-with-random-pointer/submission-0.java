/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // two passes
        // first pass create hashmap with original to cloned nodes

        // second pass is linking tog

        Map<Node, Node> clones = new HashMap<>();
        //original --> clone

        Node dummy = head;

        while(dummy != null) {
            Node clone = new Node(dummy.val);
            clones.put(dummy, clone);

            dummy = dummy.next;
            //map of original to listnode w same val
        }

        // link together nodes
        // loop through original head list
        // curr = clones.get
        Node originalHead = head; // save before loop moves it
        while(head != null) {
            Node curr = clones.get(head);
            curr.next = clones.get(head.next);
            curr.random = clones.get(head.random);
            head = head.next;
        }
        return clones.get(originalHead);


    }
}
