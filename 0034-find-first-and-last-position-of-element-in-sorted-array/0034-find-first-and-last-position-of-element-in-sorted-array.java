class Solution {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 0){

            return new int[] {-1,-1};
        }

        int low = 0;
        int high = nums.length-1;
        int[] result = new int[2];

        while(low<high){ // this loop will give index of low

            int mid = low + (high-low)/2;
           
           if(nums[mid]< target){
             
             low = mid+1;

           }else{
             high = mid;

           }
        }

        if(nums[low] != target){ // checking at this low if target exists, if not, then target is missing inside array

            return new int[] {-1,-1}; // return default value
        }
         result[0] = low; // save the low index which we got from running while loop, means we got the 1st occurance of target.
         high = nums.length; // reset this value to last again to minimize the search b/w mid and last index. 

         // running2nd time for 2nd element

         while(low<high){

            int mid = low + (high-low)/2;
           
           if(nums[mid]<= target){ // if we found the target here , 
             
             low = mid+1; // we have incrmented low by 1,

           }else{
             high = mid;

           }
        }

        result[1] = low-1; // so we have to reduce by 1

        return result;
        
    }
}