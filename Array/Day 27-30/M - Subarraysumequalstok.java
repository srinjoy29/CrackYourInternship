class Solution {
    public int subarraySum(int[] nums, int k) {
        // Initialize the variable to store the number of subarrays that sum up to k
        int ans = 0;

        // Create a HashMap to store the cumulative sum and its frequency
        // Key: cumulative sum, Value: frequency of that cumulative sum
        Map<Integer, Integer> map = new HashMap<>();
        
        // Initialize the map with a base case: cumulative sum 0 appears once
        // This helps in cases where a subarray itself sums to k from the beginning
        map.put(0, 1);
        
        // Initialize the cumulative sum to 0
        int sum = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Update the cumulative sum by adding the current element
            sum += nums[i];
            
            // Check if (sum - k) exists in the map
            // If it exists, it means there is a subarray ending at the current index
            // that sums to k. We add the frequency of (sum - k) to ans.
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            
            // Add the current cumulative sum to the map, or update its frequency
            // This helps in tracking the number of times the cumulative sum has appeared
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        // Return the total number of subarrays that sum to k
        return ans;
    }
}
