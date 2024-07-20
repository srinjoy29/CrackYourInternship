class Solution {
    public boolean isValid(String s) {
        // Create a character array to act as a stack for storing open parentheses
        char[] stack = new char[s.length()];
        int i = -1; // Index to keep track of the top of the stack
        
        // Iterate through each character in the input string
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // If the character is an open parenthesis, push it onto the stack
                stack[++i] = ch;
            } else {
                // If the character is a closing parenthesis
                if (i >= 0 && (ch == ')' && stack[i] == '(' || ch == ']' && stack[i] == '[' || ch == '}' && stack[i] == '{')) {
                    // If there is a matching open parenthesis on the stack, pop it
                    i--;
                } else {
                    // If there's no matching open parenthesis or the stack is empty, return false
                    return false;
                }
            }
        }
        // If the stack is empty at the end, all parentheses were matched, so return true; otherwise, return false
        return i == -1;
    }
}