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
    public int[] nextLargerNodes(ListNode head) {

        // Pehle size pta kiye linkedlist ka
      List<Integer> ans = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }

        int n = ans.size();
        int[] result = new int[n];

       
        for (int i = 0; i < n; i++) {
            int currentVal = ans.get(i);
            int nextGreater = 0;
            
            for (int j = i + 1; j < n; j++) {
                if (ans.get(j) > currentVal) {
                    nextGreater = ans.get(j);
                    break;
                }
            }
            result[i] = nextGreater;
        }

        return result;
    }
}