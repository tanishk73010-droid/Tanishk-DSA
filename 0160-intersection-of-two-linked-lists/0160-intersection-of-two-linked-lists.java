/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap <ListNode,Boolean> map = new HashMap<>();

        ListNode t1= headA;
         ListNode t2= headB;

         while(t1!=null)
         {
            map.put(t1,true);
             t1=t1.next;
             }

              while(t2!=null)
              {

            if(map.containsKey(t2))
             return t2;
             t2=t2.next;
             
               }
        return null;

        
    }
}