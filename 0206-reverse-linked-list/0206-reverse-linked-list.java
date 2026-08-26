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
    public ListNode reverseList(ListNode head) {
        return result(head);
        
    }

    private static ListNode result(ListNode InHead){
        ListNode prev = null;
        ListNode current = InHead;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}