class Solution {
    int index = 0; // Initialize an index to keep track of the current position in the preorder array

    /**
     * Constructs a binary tree from given preorder traversal and preLN arrays.
     *
     * @param n      The number of nodes in the tree.
     * @param pre    The preorder traversal array.
     * @param preLN  The array indicating whether a node is a leaf ('L') or non-leaf ('N').
     * @return       The root node of the constructed binary tree.
     */
    Node constructTree(int n, int pre[], char preLN[]) {
        // Base case: if index is out of bounds, return null
        if (index >= n) {
            return null;
        }

        // Create a new node with the current value from the preorder array
        Node newNode = new Node(pre[index]);
        index++; // Move to the next index in the preorder array

        // Check if the current node is a non-leaf node
        if (preLN[index - 1] == 'N') {
            // Recursively construct the left subtree
            newNode.left = constructTree(n, pre, preLN);
            // Recursively construct the right subtree
            newNode.right = constructTree(n, pre, preLN);
        }

        // Return the constructed node
        return newNode;
    }
}
