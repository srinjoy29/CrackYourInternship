class Solution {
    public ListNode reverseList(ListNode head) {
        // Initialize newHead as null. This will eventually become the new head of the reversed list.
        ListNode newHead = null;

        // Iterate through the list until we reach the end
        while (head != null) {
            // Store the next node
            ListNode next = head.next;
            
            // Reverse the current node's pointer
            head.next = newHead;
            
            // Move the newHead to point to the current node
            newHead = head;
            
            // Move to the next node in the original list
            head = next;
        }

        // Return the new head of the reversed list
        return newHead;
    }
}

