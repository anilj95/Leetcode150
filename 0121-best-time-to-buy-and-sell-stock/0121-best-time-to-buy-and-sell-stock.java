class Solution {
    public int maxProfit(int[] prices) {

        int maxprofit =0;
        int minimum = Integer.MAX_VALUE; // declare int.max to get lower value from array after comparison.
        
        for(int i =0; i< prices.length; i++){
            
            if(prices[i]< minimum){
                
                minimum = prices[i]; // it will reatin the minimum vallue over every iteration.
            }
            
            maxprofit = Math.max(maxprofit, prices[i] - minimum);
        }
        
        return maxprofit;
        
    }
}