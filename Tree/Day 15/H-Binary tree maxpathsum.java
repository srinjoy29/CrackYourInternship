class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        maxPathSumHelper(root);
        return maxSum;
    }

    private int maxPathSumHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Calculate the maximum path sum for the left and right subtrees
        int leftSum = Math.max(maxPathSumHelper(node.left), 0);
        int rightSum = Math.max(maxPathSumHelper(node.right), 0);

        // Calculate the total sum considering the current node as the connecting point
        int totalSum = node.val + leftSum + rightSum;

        // Update the global maxSum with the current totalSum
        maxSum = Math.max(maxSum, totalSum);

        // Return the maximum sum of a single path (either left or right)
        return node.val + Math.max(leftSum, rightSum);
    }
}