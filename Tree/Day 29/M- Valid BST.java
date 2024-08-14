public class Solution {
    
    // Main function to determine if a binary tree is a valid binary search tree (BST)
    public boolean isValidBST(TreeNode root) {
        // Start the recursive validation with the entire range of valid values
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    // Recursive helper function to validate the BST
    // root: current node being checked
    // minVal: the minimum value that the current node's value should be greater than
    // maxVal: the maximum value that the current node's value should be less than
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        // Base case: if the node is null, it's a valid subtree
        if (root == null) return true;
        
        // If the current node's value is not within the valid range, return false
        if (root.val >= maxVal || root.val <= minVal) return false;
        
        // Recursively check the left and right subtrees with updated valid ranges
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
