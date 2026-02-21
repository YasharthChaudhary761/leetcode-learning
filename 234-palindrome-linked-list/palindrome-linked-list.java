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
    public boolean isPalindrome(ListNode head) {
       // if(head==null || head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
          fast=fast.next.next;
          slow=slow.next;
        }
        ListNode newHead=reverseList(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                reverseList(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newHead);
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode after=null;
        while(curr!=null)
        {
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
}








































































































































































/** if (head == null || head.next == null)
        {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
          fast=fast.next.next;
          slow=slow.next;
        }
        ListNode newHead=reverseList(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                reverseList(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newHead);
        return true;
        */