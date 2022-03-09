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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode itr=head;
        
        while(itr!=null && itr.next!=null){
          if(itr.val==itr.next.val)
              itr.next=itr.next.next;
           else
               itr=itr.next;
                
        }
        return dummy.next;
    }
}