class Solution {
    public Node flatten(Node head) {
        // If the head is null, return null
        if (head == null) return head;

        // Start with the pointer p at the head of the list
        Node p = head;

        // Traverse the list
        while (p != null) {
            // If there is no child, move to the next node
            if (p.child == null) {
                p = p.next;
                continue;
            }

            // Find the tail of the child list
            Node temp = p.child;
            while (temp.next != null) {
                temp = temp.next;
            }

            // Connect the tail of the child list to the next node of p
            temp.next = p.next;
            if (p.next != null) {
                p.next.prev = temp;
            }

            // Connect p to the child and remove the child link
            p.next = p.child;
            p.child.prev = p;
            p.child = null;
        }

        // Return the modified head
        return head;
    }
}
