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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode prev=new ListNode(0);
        ListNode first=head;
        ListNode second=prev;
        prev.next=head;
        while(first!=null && first.next!=null)
        {
          first=first.next.next;
          second=second.next;
        }
        second.next=second.next.next;
        return prev.next;
    }
}