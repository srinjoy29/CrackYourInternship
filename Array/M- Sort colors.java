class Solution {
    public void sortColors(int[] nums) {
        // Step 1: Initialize variables to count occurrences of 0s and 1s
        int zeros = 0, ones = 0, n = nums.length;
        
        // Step 2: Count the number of 0s and 1s in the array
        for (int num : nums) {
            if (num == 0) {
                zeros++; // Increment zeros count if num is 0
            } else if (num == 1) {
                ones++;  // Increment ones count if num is 1
            }
        }  

        // Step 3: Overwrite the original array with the sorted numbers
        
        // Place all 0s at the beginning of the array
        for (int i = 0; i < zeros; ++i) {
            nums[i] = 0;
        }

        // Place all 1s after the 0s
        for (int i = zeros; i < zeros + ones; ++i) {
            nums[i] = 1;
        }

        // Place all 2s after the 1s
        for (int i = zeros + ones; i < n; ++i) {
            nums[i] = 2;
        }
    }
}
