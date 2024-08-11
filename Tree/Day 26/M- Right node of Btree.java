class Solution {
    // This will hold the result of the right side view
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        // Start the level order traversal with level 0
        levelOrder(root, 0);
        return result;
    }

    // Perform a modified level order traversal to capture the rightmost nodes
    void levelOrder(TreeNode node, int level) {
        if (node == null) {
            return; // Base case: If the node is null, do nothing
        }

        // If the current level is equal to the size of result,
        // it means this is the first node we are visiting at this level,
        // which will be the rightmost node in the level order traversal.
        if (result.size() == level) {
            result.add(node.val);
        }

        // Traverse the right subtree first, then the left subtree
        // This ensures we are adding the rightmost node first at each level.
        levelOrder(node.right, level + 1);
        levelOrder(node.left, level + 1);
    }
}