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
    public ListNode findKthNode(ListNode temp, int k)
    {
        k=k-1;
        while(temp!=null && k>0)
        {
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
    if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode kth=findKthNode(temp, k);
            if(kth==null)
            {
                if(prev!=null)
                {
                    prev.next=temp;
                }
                break;
            }
            ListNode next=kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head)
            {
                head=kth;
            }
            else
            {
                prev.next=kth;
            }
            prev=temp;
            temp=next;
        }
        return head;
    }  
}