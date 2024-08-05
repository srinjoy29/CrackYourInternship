class Solution {
    public void moveZeroes(int[] nums) {
        // Initialize left pointer to 0
        int left = 0;

        // Iterate through each element in the nums array with right pointer
        for (int right = 0; right < nums.length; right++) {
            // If the current element is not zero, perform the swap
            if (nums[right] != 0) {
                // Swap the elements at the right and left pointers
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                // Move the left pointer to the right
                left++;
            }
        }        
    }
}
