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
    public ListNode swapPairs(ListNode head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (head != null && head.next != null) {
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            
            // Swapping pointers
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            
            // Re-position pointers for the next iteration
            prev = firstNode;
            head = firstNode.next; 
        }
        
        return dummy.next;
    }
}
