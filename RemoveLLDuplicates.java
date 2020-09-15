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
class RemoveLLDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode current = head;
        ListNode toCheck = head.next;
        while(toCheck != null) {
            if(current.val < toCheck.val) {
                current.next = toCheck;
                current = toCheck;
                toCheck = toCheck.next;
            } else toCheck = toCheck.next;
        }
        if(current.next != null)
            current.next = null;
        return head;
    }
}