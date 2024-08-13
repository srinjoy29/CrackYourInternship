class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Check if the input array is null or has fewer than 3 elements, return an empty list if so.
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        
        // Sort the array to make it easier to avoid duplicates and use the two-pointer technique.
        Arrays.sort(nums);
        
        // Use a set to store unique triplets (to avoid duplicates).
        Set<List<Integer>> result = new HashSet<>();
        
        // Iterate over the array with the index 'i' acting as the first element of the triplet.
        for (int i = 0; i < nums.length - 2; i++) {
            // Initialize two pointers: 'left' starts just after 'i', and 'right' starts at the end of the array.
            int left = i + 1;
            int right = nums.length - 1;
            
            // Use a while loop to try different combinations of 'left' and 'right' to find valid triplets.
            while (left < right) {
                // Calculate the sum of the current triplet.
                int sum = nums[i] + nums[left] + nums[right];
                
                // If the sum is zero, we found a valid triplet.
                if (sum == 0) {
                    // Add the triplet to the set (duplicates are automatically handled by the set).
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Move both pointers inward to check for other possible triplets.
                    left++;
                    right--;
                }
                // If the sum is less than zero, move the 'left' pointer to the right to increase the sum.
                else if (sum < 0) {
                    left++;
                }
                // If the sum is greater than zero, move the 'right' pointer to the left to decrease the sum.
                else {
                    right--;
                }
            }
        }
        // Convert the set to a list and return it as the final result.
        return new ArrayList<>(result);
    }
}
