class Solution {
    // Function to merge two sorted linked lists
    Node mergeTwoLists(Node a, Node b) {
        // Create a temporary node to start the merged list
        Node temp = new Node(0);
        Node res = temp; // This will point to the head of the merged list

        // Traverse both lists
        while (a != null && b != null) {
            // If the data in list 'a' is less than the data in list 'b'
            if (a.data < b.data) {
                // Append the node from list 'a' to the merged list
                temp.bottom = a;
                temp = temp.bottom; // Move the pointer to the next node in merged list
                a = a.bottom; // Move to the next node in list 'a'
            } else {
                // Append the node from list 'b' to the merged list
                temp.bottom = b;
                temp = temp.bottom; // Move the pointer to the next node in merged list
                b = b.bottom; // Move to the next node in list 'b'
            }
        }

        // If there are remaining nodes in list 'a' or 'b', append them to the merged list
        if (a != null) temp.bottom = a;
        else temp.bottom = b;

        // Return the head of the merged list (skipping the initial dummy node)
        return res.bottom;
    }

    // Function to flatten a linked list
    Node flatten(Node root) {
        // Base cases: if the list is empty or has only one list, return it as is
        if (root == null || root.next == null)
            return root;

        // Recur for the list on the right
        root.next = flatten(root.next);

        // Merge the current list with the flattened list on the right
        root = mergeTwoLists(root, root.next);

        // Return the root, which will be merged with its left in subsequent calls
        return root;
    }
}
