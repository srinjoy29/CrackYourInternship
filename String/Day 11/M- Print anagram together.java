class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<String, List<String>> anagram = new HashMap<>();
        
        for (String word : string_list) {
            char[] charArray = word.toCharArray(); // Convert the string into a character array
            Arrays.sort(charArray); // Sort the characters in the array
            String sortedChar = new String(charArray); // Convert the sorted character array back to a string
            
            if (!anagram.containsKey(sortedChar)) {
                anagram.put(sortedChar, new ArrayList<>()); // If the sorted string is not already a key, add it
            }
            
            anagram.get(sortedChar).add(word); // Add the original word to the list corresponding to the sorted string
        }
        
        List<List<String>> result = new ArrayList<>(anagram.values()); // Convert the values of the map into a list of lists
        
        return result;
    }
}
