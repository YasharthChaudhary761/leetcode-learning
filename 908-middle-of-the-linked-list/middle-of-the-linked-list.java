class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        ListNode first=head;
        ListNode second=head;
        while(first!=null && first.next!=null)
        {
          first=first.next.next;
          second=second.next;
        }
        return second;
    }
}
    /**    int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        int middle = length / 2;
        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }
        return current;
        */