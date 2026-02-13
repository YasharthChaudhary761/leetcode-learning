/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode one=head;
        ListNode two=head;
        while(two!=null && two.next!=null)
        {
            two=two.next.next;
            one=one.next;
            if(two==one) return true;
        }
        return false;
    }
}