class Solution {
    // Main method to invert the binary tree
    public TreeNode invertTree(TreeNode root) {
        // Base case: if the node is null, return null
        if (root == null) return null;

        // Store the left and right children of the current node
        final TreeNode left = root.left, right = root.right;

        // Recursively invert the right subtree and assign it to the left child
        root.left = invertTree(right);
        // Recursively invert the left subtree and assign it to the right child
        root.right = invertTree(left);

        // Return the current node (which now has its children inverted)
        return root;
    }
}
