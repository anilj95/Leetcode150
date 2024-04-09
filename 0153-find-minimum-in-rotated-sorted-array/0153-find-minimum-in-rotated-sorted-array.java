class Solution {
    public int findMin(int[] nums) {

        int low =0;
        int high = nums.length-1;

        int mid =0;

        while(low<high){

            mid = low +(high-low)/2;

            if(nums[mid]> nums[high]){// it should not be the ideal case, as nums[high] > nums[mid] for sorted Array
                                      // so this part is not sorted and we will search here only for minium element.

                low = mid+1; // we left the soted array and finding the element in unsorted one.
            }else{

                high = mid; //if right array is sorted, problem is in left one, so find in left array.
            }
        }

        return nums[low];
        
    }
}