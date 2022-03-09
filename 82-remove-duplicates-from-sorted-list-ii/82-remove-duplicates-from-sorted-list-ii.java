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
        ListNode itr_list=dummy;
        while(itr!=null){
           if(itr.next!=null && itr.val==itr.next.val){
               while(itr.next!=null && itr.val==itr.next.val)
                   itr=itr.next;
               itr_list.next=itr.next;
           }else{
              itr_list=itr_list.next; 
           }
            itr=itr.next;
            
        }
        return dummy.next;
    }
}