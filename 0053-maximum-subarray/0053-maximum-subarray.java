class Solution {
    public int maxSubArray(int[] nums) {
       
         // also called Kadane's algorithm
        
        int sum =0;
        int max_sum = nums[0]; // fixed 0th position as max sum.
        
        for(int i=0;i<nums.length;i++){
            
            sum = sum + nums[i];
        
        if(sum>max_sum){
            
            max_sum = sum; // updating max value
        }
        if(sum<0){
            
            sum = 0;// we are discarding -ve value as it will not contribute to max sum
        }
        
    }
        return max_sum;
    }
}