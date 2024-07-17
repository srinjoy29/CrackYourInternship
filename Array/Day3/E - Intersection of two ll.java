public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either of the lists is empty, there can be no intersection
        if (headA == null || headB == null) return null;

        // Initialize two pointers at the heads of the two lists
        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists until the two pointers meet
        // The loop will end when both pointers are equal, either at the intersection node or both at null
        while (a != b) {
            // If pointer a reaches the end of its list, reset it to the head of the other list
            // This ensures that it will traverse the other list completely on the next pass
            a = (a == null) ? headB : a.next;
            
            // If pointer b reaches the end of its list, reset it to the head of the other list
            // This ensures that it will traverse the other list completely on the next pass
            b = (b == null) ? headA : b.next;
        }
        
        // When the pointers meet, return the node (could be null if no intersection)
        return a; // or return b; both are the same at this point
    }
}
