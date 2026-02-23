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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode dummy=new ListNode(0);
        dummy.next = head;

        
        ListNode prev=dummy;
        for(int i=0;i<left-1;++i)  // prev ko left ke pehle tak le jaa rha hai
        {
            prev=prev.next;
        }

        ListNode curr=prev.next;

        for(int i=0;i<(right-left);++i)    // right -left krr rhe hai...jisse ye pta chalega ki kitni baar ye wala process krna hai
        {
            ListNode NXT=curr.next;
            curr.next=NXT.next;
            NXT.next=prev.next;       // Ye khud se dry run krke dekho..ye charo line
            prev.next=NXT;
        }
        return dummy.next;
    }
}



/**if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode leftHold=null;
        ListNode rightHold=null;
        
        while(temp!=null)
        {
            if(temp.val==left)
            {
                leftHold=temp;
            }
            if(temp.val==right)
            {
                rightHold=temp;
            }
            temp=temp.next;
        }
        
        ListNode curr=leftHold;
        ListNode prev=null;
        ListNode after=null;
        ListNode rightend=rightHold.next;

        while(curr.next!=null)
        {
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
         while(prev.next!=null)
        {
            if(prev.next==null)
            {
                prev.next=rightend;
            }
        } 
        head.next=prev;

        return head; */