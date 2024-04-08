class Solution {
    public int[] productExceptSelf(int[] nums) {

        // for this question, we will calculate left and right, two array, for each elements in given array.
        //Note for 1st element (0th)position, nth is at left so we will take as 1 similarly for last element of the
        // array, nth is right, so we will take as 1.
        
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length]; // for returning resultant array are multiplying both array.
        
      left[0] =1; // nth is left of 1st element so, default is taking as 1, coz multiply with 1 will not change anything.
        
        for(int i =1; i< length; i++){
            
            left[i] = left[i-1] * nums[i-1];
        }
        
        //similarly for right array
        
        right[length-1] =1 ;
        
        for(int i=length-2 ;i>-1; i--){ // starting from right most of nums array.
            
            right[i] = right[i+1] * nums[i+1];
            
        }
        
        for(int i =0; i< length;i++){
            
            result[i] = left[i] * right[i];
        }
        
        return result;
        
        
    }
}