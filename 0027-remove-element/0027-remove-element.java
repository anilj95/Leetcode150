class Solution {
    public int removeElement(int[] nums, int val) {

        // for this question we have to remove val, and retrun the count of remaining elements
        // in the nums array.
        
        int count = 0;
        
        for(int i=0; i<nums.length;i++){
            
            if(nums[i] != val)// 
                
                nums[count++] = nums[i];// moving ahead without val inside same nums[], we have to count ++ for placing
                                        // remaining element at correct position and also reserve no. of count.
            
        }
        
        return count;
        
    }
}