class Solution {
    // Main method to check if tree 't' is a subtree of tree 's'
    public boolean isSubtree(TreeNode s, TreeNode t) { // Time complexity: O(m * n)
        // Base case: if tree 's' is null
        if (s == null) {
            // 't' must also be null to be a subtree
            return t == null;
        }
        // Check if 't' is identical to 's' or if 't' is a subtree of 's.left' or 's.right'
        return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    // Helper method to check if two trees are identical
    private boolean isSame(TreeNode t1, TreeNode t2) { // Time complexity: O(n)
        // Base case: if both nodes are null, they are identical
        if (t1 == null && t2 == null) return true;
        // If one of the nodes is null and the other is not, they are not identical
        if (t1 == null || t2 == null) return false;

        // If the values of the nodes do not match, they are not identical
        if (t1.val != t2.val) return false;
        // Recursively check if the left and right subtrees are identical
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
}
