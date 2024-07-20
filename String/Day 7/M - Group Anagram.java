class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store the sorted string and its corresponding index in the ans list
        Map<String, Integer> mp = new HashMap<>();
        // Create a list to store the grouped anagrams
        List<List<String>> ans = new ArrayList<>();

        // Loop through each string in the input array
        for (String str : strs) {
            // Convert the string to a character array
            char[] chars = str.toCharArray();
            // Sort the character array
            Arrays.sort(chars);
            // Convert the sorted character array back to a string
            String sortedStr = new String(chars);
            
            // Check if the sorted string is already in the map
            if (mp.containsKey(sortedStr)) {
                // If it is, add the original string to the corresponding list in ans
                ans.get(mp.get(sortedStr)).add(str);
            } else {
                // If it is not, add the sorted string to the map with the current size of ans as its value
                mp.put(sortedStr, ans.size());
                // Add a new list containing the original string to ans
                ans.add(new ArrayList<>(Arrays.asList(str)));
            }
        }

        // Return the list of grouped anagrams
        return ans;
    }
}
