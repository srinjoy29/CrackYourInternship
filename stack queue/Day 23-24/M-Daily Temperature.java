class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Initialize the result array to store the number of days until a warmer temperature
        int[] result = new int[temperatures.length];
        // Variable to track the hottest temperature seen so far from the right
        int hottest = 0;

        // Loop through the temperatures array from right to left
        for (int i = temperatures.length - 1; i >= 0; i--) {
            // If the current temperature is greater than or equal to the hottest temperature seen so far
            if (temperatures[i] >= hottest) {
                // Update hottest to the current temperature
                hottest = temperatures[i];
                // Continue to the next iteration since there is no warmer day ahead
                continue;
            }

            // Initialize days to 1, representing the next day
            int days = 1;
            // Find the number of days until a warmer temperature
            while (temperatures[i + days] <= temperatures[i]) {
                // Skip to the next possible warmer day by adding result[i + days] to days
                days = days + result[i + days];
            }
            // Store the number of days until a warmer temperature in the result array
            result[i] = days;
        }

        // Return the result array
        return result;
    }
}
// Explanation of the Problem
// The problem asks to find, for each day in the input array temperatures, 
// how many days you have to wait until a warmer temperature. 
// If there is no future day with a warmer temperature, store 0 for that day. 
// The solution iterates through the array from right to left, leveraging the 
// previously computed results to efficiently calculate the number of days until a 
// warmer temperature for each day.