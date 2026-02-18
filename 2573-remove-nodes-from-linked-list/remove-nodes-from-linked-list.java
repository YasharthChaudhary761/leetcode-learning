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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stk=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            while(!stk.isEmpty() && stk.peek().val < temp.val)
            {
                stk.pop();
            }
            stk.push(temp);
            temp=temp.next;
        }
        while(!stk.isEmpty())
        {
            ListNode top=stk.pop();
            top.next=temp;
            temp=top;
        }
        return temp;
    }
}