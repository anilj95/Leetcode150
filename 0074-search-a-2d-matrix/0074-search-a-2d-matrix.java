class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // starting the search from last elemnt of 1st row(7)
        // we are using binary search
        int left =0;
        int right = matrix[0].length-1; // row length
        
        while( left < matrix.length && right>=0){ // boundary condition.
            
            
            if(target == matrix[left][right]){
                
                return true;
                
            }else if(target< matrix[left][right]){
                
                right--;
            }else{
                
                left++;
            }
        }
        
        return false;
        
    }
}