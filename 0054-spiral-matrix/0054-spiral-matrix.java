class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList();// to display result
        
        int colomnbegin =0;
        int colomnend =matrix[0].length-1;
        int rowbegin =0;
        int rowend =matrix.length-1;
        
        // basic checks
        
        if(matrix.length ==0) return res;
        
        while(rowbegin<= rowend && colomnbegin <= colomnend){
            
            
        // traverse right(i.e throuth colomn)
        
        for(int i = colomnbegin; i<=colomnend;i++){
            
            res.add(matrix[rowbegin][i]); //matrix[row][colomn]
        }
            rowbegin++; // have to change position for start from downward row
            
        // traverse down(i.e throuth row)
            
          for(int i = rowbegin; i<=rowend;i++){
            
            res.add(matrix[i][colomnend]);
        } 
            
            colomnend--; // for start from next element from colomnend
            
    // traverse left(i.e throuth colomn)
            
            if(rowbegin<=rowend){ // sanity check row check for colomn
                
           for(int i = colomnend; i>=colomnbegin;i--){
            
            res.add(matrix[rowend][i]);
            }   
            
            }
            rowend--;
            
            
        // traverse upward(i.e through row)
            
            if(colomnbegin<=colomnend){// sanity check colomn check for row
                
           for(int i = rowend; i>=rowbegin;i--){
            
            res.add(matrix[i][colomnbegin]);
            }   
            
          } 
             colomnbegin++;
     
            
        }
        
        return res;
   
        
    }
}