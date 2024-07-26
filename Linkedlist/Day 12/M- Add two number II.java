class Solution {
    // Helper method to reverse a linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Initialize previous node to null
        ListNode curr = head; // Start with the head node

        while (curr != null) {
            ListNode next = curr.next; // Store the next node
            curr.next = prev;          // Reverse the link
            prev = curr;               // Move prev to the current node
            curr = next;               // Move to the next node
        }
        
        return prev; // prev is the new head of the reversed list
    }

    // Helper method to add two numbers represented by linked lists
    public ListNode helper(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify result list handling
        ListNode tail = dummyHead; // Tail node to build the new list
        int carry = 0; // Initialize carry to 0

        // Loop until both lists are fully traversed or there is no carry left
        while (l1 != null || l2 != null || carry != 0) {
            // Get the current digit values, 0 if the node is null
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum and the new carry
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10; // Single digit to store in the current node
            carry = sum / 10; // Update carry

            // Create a new node with the calculated digit and add it to the result list
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            // Move to the next nodes in the input lists if they exist
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummyHead.next; // Return the result list starting from dummyHead.next
    }

    // Main method to add two numbers represented as linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse both input lists to make addition easier
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        // Add the reversed lists
        ListNode ans = helper(l1, l2);
        // Reverse the result list to restore the original order
        return reverseList(ans);
    }
}
