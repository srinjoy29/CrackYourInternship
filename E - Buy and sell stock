class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min = prices[0];
        int max=0;
        for (int newprice : prices){
            min=Math.min(newprice,min);
            profit=newprice-min;
            max=Math.max(profit , max);

    
        }
        return max;
    }
}
