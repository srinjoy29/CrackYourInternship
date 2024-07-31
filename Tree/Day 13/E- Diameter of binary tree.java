class Solution {

    // Static variable to keep track of the maximum diameter found
    static int max;

    // Helper method to calculate the height of the tree
    static int height(TreeNode root) {
        // Base case: if the node is null, return 0
        if (root == null) return 0;

        // Recursively calculate the height of the left subtree
        int left = height(root.left);
        // Recursively calculate the height of the right subtree
        int right = height(root.right);

        // Update the maximum diameter found so far
        max = Math.max(max, left + right);

        // Return the height of the current node
        return 1 + Math.max(left, right);
    }

    // Main method to calculate the diameter of the binary tree
    public int diameterOfBinaryTree(TreeNode root) {
        // Initialize max to 0
        max = 0;
        // Call the height method to start the calculation
        height(root);
        // Return the maximum diameter found
        return max;
    }
}
