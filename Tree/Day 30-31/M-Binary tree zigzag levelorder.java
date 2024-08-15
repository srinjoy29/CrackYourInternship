class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Result list to store the zigzag level order traversal
        List<List<Integer>> result = new ArrayList<>();

        // Base case: if the root is null, return an empty list
        if (root == null) {
            return result;
        }

        // Queue to facilitate level order traversal
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root); // Start with the root node

        // Boolean flag to track the current direction (left to right or right to left)
        boolean leftToRight = true;

        // Process nodes level by level
        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size(); // Number of nodes at the current level
            List<Integer> row = new ArrayList<>(size); // List to store nodes' values at the current level

            // Initialize the row list with placeholders
            for (int i = 0; i < size; i++) {
                row.add(0);
            }

            // Traverse the nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll(); // Get the next node from the queue

                // Determine the index to place the node's value based on the current direction
                int index = leftToRight ? i : (size - 1 - i);

                // Set the node's value in the row list at the calculated index
                row.set(index, node.val);

                // Add the left child to the queue if it exists
                if (node.left != null) {
                    nodesQueue.offer(node.left);
                }

                // Add the right child to the queue if it exists
                if (node.right != null) {
                    nodesQueue.offer(node.right);
                }
            }

            // After processing this level, reverse the direction for the next level
            leftToRight = !leftToRight;

            // Add the current level's result to the final result list
            result.add(row);
        }

        // Return the zigzag level order traversal result
        return result;
    }
}