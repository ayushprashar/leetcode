class AppendLLIncr {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        } else if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        ListNode head = (l1.val < l2.val) ? l1 : l2;
        ListNode resultNode = null;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                if(resultNode == null) {
                    resultNode = head;
                    l1 = l1.next;
                } else {
                    resultNode.next = l1;
                    l1 = l1.next;
                    resultNode = resultNode.next;
                }
            } else {
                if(resultNode == null) {
                    resultNode = head;
                    l2 = l2.next;
                } else {
                    resultNode.next = l2;
                    l2 = l2.next;
                    resultNode = resultNode.next;
                }
            }
        }
        
        if(l1 == null) {
            resultNode.next = l2;
        } else if(l2 == null) {
            resultNode.next = l1;
        }
        
        return head;
    }
}