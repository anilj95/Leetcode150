class Solution {
    public int jump(int[] nums) {
        
        int jump =0;
        int farthest = 0;
        int lastJumpedIndex =0;
        
        if(nums.length == 1) return 0; // base case
        
        for(int  i=0; i< nums.length;i++){
            
             farthest = Math.max(farthest, i+nums[i]);// 2, 4, 
            
            if(i == lastJumpedIndex){ 
                
                lastJumpedIndex = farthest;
                
                jump++;
                
                if(farthest >= nums.length-1){
                    
                    return jump;
                }
            }
       
        }
        
        return jump;
        
    }
}