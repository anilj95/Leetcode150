class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

         // we will start checking from last element of 1st row(15), below that, elements are in increasing order
        // rows elements are in increasing order: so we are applying kind of Binary search
        
        int left = 0;
        int right = matrix[0].length-1;
            
            while( left< matrix.length && right >=0 ){
                
                if(matrix[left][right] == target){
                    
                    return true;
                    
                }else if( target< matrix[left][right]){
                    
                    right--;
                }else{
                    
                    left++;
                }
            }
        
        return false;
        
    }
}