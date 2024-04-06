class Solution {
    public int removeDuplicates(int[] nums) {
       int count = 0;
        
        for(int n : nums){
            
            if(count<2 || n != nums[count-2]){  //1st condn : will save initial 2 elements inside nums without looking                                                  //  at 2nd condition, from then on, 2nd condn will take care.
                
                nums[count++] = n;
            }
        }
        
        return count;
    }
}