/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LLIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        int lenA = 0;
        int lenB = 0;
        while(tempA != null) {
            tempA = tempA.next;
            lenA++;
        }
        while(tempB != null) {
            tempB = tempB.next;
            lenB++;
        }
        
        if(lenA > lenB) {
            int diff = lenA -lenB;
            for(int i =0; i < diff; i++)
                headA = headA.next;
        }
        
        if(lenB > lenA) {
            int diff = lenB -lenA;
            for(int i =0; i < diff; i++)
                headB = headB.next;
        }
        
        while(headA != headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}