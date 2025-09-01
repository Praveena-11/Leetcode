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
        head = reverse(head);
        int maxVal = head.val;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val < maxVal) {
                curr.next = curr.next.next; 
            } else {
                curr = curr.next;
                maxVal = curr.val; 
            }
        }

        return reverse(head);
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null, curr = node;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
