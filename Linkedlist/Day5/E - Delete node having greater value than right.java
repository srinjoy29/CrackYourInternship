class Solution {
    Node compute(Node head) {
        return removeNodes(head, Integer.MIN_VALUE);
    }

    // Recursive method to remove nodes with a greater value on the right
    private Node removeNodes(Node node, int maxSoFar) {
        // Base case: if the node is null, return null
        if (node == null) {
            return null;
        }

        // Recursively call for the next node
        Node nextNode = removeNodes(node.next, maxSoFar);

        // Update the max value seen so far
        if (nextNode != null) {
            maxSoFar = Math.max(maxSoFar, nextNode.data);
        }

        // If the current node's data is less than maxSoFar, it should be deleted
        if (node.data < maxSoFar) {
            return nextNode;
        } else {
            // Otherwise, keep the current node and update its next pointer
            node.next = nextNode;
            return node;
        }
    }
}