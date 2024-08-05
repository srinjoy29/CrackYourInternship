class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // If the input array contains only one element, return an empty list
        if (nums.length == 1) {
            return new ArrayList<>();
        }

        // Initialize an empty list to store the duplicates
        List<Integer> lst = new ArrayList<>();

        // Create an array to count occurrences of each number in the input array
        int[] cnt = new int[nums.length + 1];

        // Count the occurrences of each number in the input array
        for (int num : nums) {
            cnt[num]++;
        }

        // Iterate through the count array to find numbers that appear exactly twice
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 2) {
                lst.add(i);
            }
        }

        // Return the list of duplicates
        return lst;
    }
}
