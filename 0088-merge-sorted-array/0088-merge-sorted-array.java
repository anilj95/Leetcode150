class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length1 = m-1;
        int length2 = n-1;
        int totalLength = m+n-1; //-1 in all because array starts from 0th index.
        
        //idea is to insert from back side by comparing last elemnt of both sorted array.
        
        while(length2>=0){ //want to run only upo the length of 2nd array.
            
            if(length1>=0 && nums1[length1] > nums2[length2]){
                
                nums1[totalLength--] = nums1[length1--];
            }else{
                
                 nums1[totalLength--] = nums2[length2--];
            }
            
        }
        
    }
}