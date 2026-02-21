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
        if(head.next==null) return true;
       ListNode fast=head;
       ListNode slow=head;
       ListNode temp=null;
       while(fast!=null && fast.next!=null)
       {
        slow = slow.next;
        fast = fast.next.next;
       }
       temp=slow;
       ListNode prev=null;

       while(temp!=null)
       {
           ListNode nextNode=temp.next;
           temp.next=prev;
           prev=temp;
           temp=nextNode;
       }

       ListNode dummyhead=head;
       while(prev!=null)
       {
           if(dummyhead.val!=prev.val) return false;
           dummyhead=dummyhead.next;
           prev=prev.next;
       }
       return true;

    }
}



/** 
 ListNode Fast = head;
        ListNode Slow = head;
        while(Fast != null && Fast.next != null)
        {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }//Yaha tak mid tak reach kiye

        ListNode PreviousNode = null;
        while(Slow != null)
        {
            ListNode NextPointer = Slow.next;
            Slow.next = PreviousNode;
            PreviousNode = Slow;
            Slow = NextPointer;
        }//Reverse Kar diya Mid Ke Right Side ko

        ListNode LeftPointer = head;
        ListNode RightPointer = PreviousNode;
        while(RightPointer!=null){
            if(LeftPointer.val != RightPointer.val) return false;
            LeftPointer = LeftPointer.next;
            RightPointer = RightPointer.next;
        } //Yaha humare paas do alag linked list ho gaye ek 1->2  ek 2->1. Comparing from bith end
        return true;
**/



































































































































































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