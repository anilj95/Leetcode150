class Solution {
    public int searchInsert(int[] nums, int target) {

        // using two pointer approach, same as finding two sum in sorted array.
        // only one change, if target is not present return left pointer, also search upto left<=right.
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            
            int mid = left + (right-left)/2;
            
            if(nums[mid] == target){
                
                return mid; //it will give the target index.
            }else if(nums[mid]< target){
                
                left++;
            }else{
                
                right--;
            }
        }
        
        return left; // we return possible index at which target should be if not present in array.
    }
}