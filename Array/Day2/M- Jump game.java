class Solution {
    public boolean canJump(int[] nums) {
        // Initialize the final position to the last index
        int finalpos = nums.length - 1;

        // Iterate backwards from the second last index to the start
        for (int idx = nums.length - 2; idx >= 0; idx--) {
            // Check if the current index can reach the final position
            if (idx + nums[idx] >= finalpos) {
                // Update the final position to the current index
                finalpos = idx;
            }
        }

        // If the final position is 0, we can reach the last index from the start
        return finalpos == 0;
    }
}
