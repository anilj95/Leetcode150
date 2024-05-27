class Solution {
    public int findPeakElement(int[] nums) {
        
        // we will use binary search approach for TC: O(logn), also we are considering  that peak is the element which is greater than
        // its left and right element, but in case of 1st amd last element we need to be caefull as no left element is available for
        // 0th element and no right element is available for last element. watch out for 1st if condition.
        
        int left =0; int right = nums.length-1;
        
        while(left<right){
            
            int mid = left + (right-left)/2;
            
            // this check was enough for normal case : nums[mid]> nums[mid-1] && nums[mid] > nums[mid+1]
            // if mid == 0, it will not check or(||) condn, it will go to && condn
            //(mid == 0 || nums[mid] > nums[mid-1]) && nums[mid] > nums[mid+1]
            //if mid == nums.length -1,i.e  it is at last position, it will not check: nums[mid] > nums[mid+1]
            
            if( (mid == 0 || nums[mid] > nums[mid-1]) && (mid == nums.length -1 || nums[mid] > nums[mid+1])){
                
                return mid;
            }else if(nums[mid]> nums[mid+1]){
                
                right = mid;
            }else{
                
                left = mid+1;
            }
        }
        
        return left; // or return right;  both points to same element

    }     

}

// brute force approach : TC: O(N) : linear search 

//     public int solution2(int[] nums){
        
//         if(nums.length == 1) return 0;
        
//         for(int i =0; i<nums.length;i++){
            
//          // condn for 0th position element, if only right element is smaller than 0th element, it is also peek.   
//             if(i =0 && nums[0]> nums[1]) return 0;
            
//          // condn for last position element, if only left element is smaller than last element, it is also peek.    
//             if(i = nums.length-1 && nums[i] > nums[i-1]) return nums.length-1;
            
//          // normal case condition
            
//             if(nums[i]> nums[i-1] && nums[i] > nums[i+1]) return i;
     
//         }
//         return -1;
        
//    