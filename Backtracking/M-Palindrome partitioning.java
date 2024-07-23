class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>(); // List to store the final result
        backtrack(s, 0, new ArrayList<>(), result); // Call the backtracking function
        return result; // Return the result
    }

    private void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        if (start == s.length()) { // If we've reached the end of the string
            result.add(new ArrayList<>(currentList)); // Add the current partition to the result
            return; // Backtrack
        }

        for (int end = start; end < s.length(); end++) { // Iterate from the current start position to the end of the string
            if (isPalindrome(s, start, end)) { // Check if the substring s[start:end+1] is a palindrome
                currentList.add(s.substring(start, end + 1)); // Add the palindrome substring to the current partition
                backtrack(s, end + 1, currentList, result); // Recur for the remaining substring
                currentList.remove(currentList.size() - 1); // Remove the last added substring to backtrack
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) { // Compare characters from the start and end moving towards the center
            if (s.charAt(low++) != s.charAt(high--)) { // If characters don't match
                return false; // It's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}
