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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1;i<k;i++)  //k-1 tak chalega Nii to even odd elements wale me dikkat ayega
        {
            temp=temp.next;  // Kyyuki temp =temp.next to ho hi rha hai
        }

        ListNode fast=temp;
        ListNode slow=head;

        while(temp.next!=null )
        {
            temp=temp.next;
            slow=slow.next;
        }
        ListNode Y = slow;
            int t = fast.val;
            fast.val = Y.val;
            Y.val = t;
            return head;
    }
}