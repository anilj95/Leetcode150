class Solution {
    public int removeDuplicates(int[] nums) {

    int count =0;
        
        for(int i =0; i<nums.length;i++){
            
            if(i< nums.length -1 && nums[i] == nums[i+1]){ //doing -1, to avoid arrayoutofbouond because of nums[i+1]
                
                continue; // bypassing the same value
            }else{
                
                nums[count++] = nums[i]; //saving only unique value.
            }
        }
        
        return count;
        
    }
}