class Solution {
    public void rotate(int[] nums, int k) {
       
        int n = nums.length;
        k = k%n; // what if k value is equal or greater.
        reverse(nums, 0, n-1); //reverse whole array
        reverse(nums, 0, k-1); // again reverse upto kth
        reverse(nums,k,n-1); // again reverse from kth to last of array.
        
        
}
    
    void reverse(int[] nums, int start, int end){
        
        while(start<=end){
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]   = temp;
            
            start++;
            end--;
        }
    }
    
}