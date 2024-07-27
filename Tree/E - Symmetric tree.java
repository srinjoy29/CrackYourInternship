class Solution {
    // Main method to check if the binary tree is symmetric
    public boolean isSymmetric(TreeNode root) {
        // If the root is null, the tree is symmetric
        if (root == null) {
            return true;
        }

        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    // Helper method to check if two trees are mirrors of each other
    private boolean isMirror(TreeNode node1, TreeNode node2) {
        // If both nodes are null, they are mirrors of each other
        if (node1 == null && node2 == null) {
            return true;
        }
        // If one of the nodes is null and the other is not, they are not mirrors
        if (node1 == null || node2 == null) {
            return false;
        }

        // Check if the values of the nodes are equal and
        // if the left subtree of node1 is a mirror of the right subtree of node2
        // and the right subtree of node1 is a mirror of the left subtree of node2
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
