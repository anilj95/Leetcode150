class Solution {
    public int maxProfit(int[] prices) {
        
        
        // for this question, think if today's price is greater than last day, if yes, keep on adding
        // the difference in profit variable and return the same as total profit.
        
        int profit =0;
        
        for(int i=1; i<prices.length; i++){// start from 1, to compare with last day price.
            
            if(prices[i]> prices[i-1]){
            profit += prices[i] - prices[i-1]; // keep adding to profit variable

            }
        
        }
        return profit;

        
    }
}