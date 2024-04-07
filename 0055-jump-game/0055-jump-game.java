class Solution {
    public boolean canJump(int[] nums) {
        
        int reach =0;
        
        for(int  i =0; i< nums.length ;i++){
            
            if(reach<i) return false; // reach is the maximum length we can cover, when i == length of array
                                      // and reach is < i ; means not able to get at last of array.
            
            reach = Math.max(reach, i+ nums[i]); //  suppose we r at 1st index, and its value is 3, total reach
                                                 // we achieved is 1+3 = 4, i,  we already achieved via iteration.
                                                 // so we have to add the previous achievement to new value.
        }
        
        return true;
        
    }
}