class Solution {
    public static String removeKdigits(String num, int k) {
        // Use a StringBuilder to build the result incrementally
        StringBuilder res = new StringBuilder();

        // Iterate through each character in the given number string
        for (char n : num.toCharArray()) {
            // While there are still digits to remove (k > 0),
            // and the result is not empty, and the last digit in result
            // is greater than the current digit 'n', remove the last digit from result
            while (k > 0 && !res.isEmpty() && res.charAt(res.length() - 1) > n) {
                res.setLength(res.length() - 1); // Remove last character
                k--; // Decrease the count of digits to remove
            }
            // Append the current digit to the result
            res.append(n);
        }

        // If there are still digits left to remove, remove them from the end
        res.setLength(res.length() - Math.min(k, res.length()));

        // Remove leading zeros by finding the first non-zero character
        int start = 0;
        while (start < res.length() && res.charAt(start) == '0') {
            start++;
        }

        // Extract the substring from the first non-zero character
        String ans = res.substring(start);

        // If the resulting string is empty, return "0"
        return ans.isEmpty() ? "0" : ans;
    }
}




class Solution {
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate over each character in the input number string
        for (char c : num.toCharArray()) {
            // While the stack is not empty, we still need to remove digits (k > 0),
            // and the top of the stack is greater than the current character 'c'
            // pop the stack and decrease k
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            
            // Push the current character onto the stack
            // Only push if the stack is not empty or the character is not '0' to avoid leading zeros
            if (!stack.isEmpty() || c != '0') {
                stack.push(c);
            }
        }
        
        // If there are still digits left to remove, remove them from the top of the stack
        while (!stack.isEmpty() && k-- > 0) {
            stack.pop();
        }
        
        // Build the final result string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        // Reverse the string since we have built it in reverse order
        sb.reverse();
        
        // Convert StringBuilder to String and handle the case for an empty result
        String result = sb.toString();
        return result.isEmpty() ? "0" : result;
    }
}

