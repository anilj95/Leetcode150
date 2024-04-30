class Solution {
    public void rotate(int[][] matrix) {
        
        //I am folowing the approach: 1st calculate the transpose of matrix then reverse  the each row element you will
        // get the 90* rotation.
        
        // transpose of matrix: just swap rows with column = transpose
        
        for(int i =0; i<matrix.length-1;i++){
            
            for(int j = i+1; j< matrix.length ; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // reverse each rows
        
        for(int i =0; i< matrix.length; i++){
            
            int left = 0;
            int right = matrix[0].length-1;
            
            while(left<right){
                
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right]; // row is constant/loop :0 ; 1 for 2nd loop; 3 for 3rd loop.
                matrix[i][right] = temp;
                
                left++;
                right--;
            }
        }
        
    }
}