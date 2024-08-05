class Solution {
    public int maxProfit(int[] prices) {
        // Initialize profit to 0
        int profit = 0;
        // Initialize min to the first element in the prices array
        int min = prices[0];
        // Initialize max to 0 to keep track of the maximum profit
        int max = 0;

        // Iterate through each price in the prices array
        for (int newprice : prices) {
            // Update min to the smallest price seen so far
            min = Math.min(newprice, min);
            // Calculate the current profit by subtracting min from the current price
            profit = newprice - min;
            // Update max to the maximum profit seen so far
            max = Math.max(profit, max);
        }

        // Return the maximum profit
        return max;
    }
}

