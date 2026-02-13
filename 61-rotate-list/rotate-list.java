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
    public ListNode findlastnode(ListNode temp,int k)
    {
        int count=1;
        while(temp!=null)
        {
          if(count==k) return temp;
          count++;
          temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        int size=1;
        ListNode tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
            size++;
        }
        if(k%size==0) return head;
        k = k % size;
        tail.next=head;
        ListNode newlastnode=findlastnode(head,size-k);
        head=newlastnode.next;
        newlastnode.next=null; 
        return head;
    }
}