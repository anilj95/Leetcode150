class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        
        //creating stack to save first interval
        
        Stack<int[]> stack = new Stack();
        
        stack.add(intervals[0]);
        
        for(int i=1; i< intervals.length;i++){
             
            int startpoint2 = intervals[i][0];
            int endpoint2 = intervals[i][1];
            
            int[] poparray = stack.pop();
            
            int startpoint1 = poparray[0];
            int endpoint1 = poparray[1];
            
            if( startpoint2<= endpoint1){
                
                int[] merge = {startpoint1, Math.max(endpoint1,endpoint2)}; // merging left most and maximum of right.
                
                stack.add(merge);
                
                
            }else{
                
                stack.add(poparray);
                stack.add(intervals[i]);
                
            }
            
        }
        // forming result for return
        int output[][] = new int[stack.size()][2];
        
        for(int i =output.length-1; i>=0;i--){
            
            int[] poparray = stack.pop();
            
            output[i][0] = poparray[0];
            output[i][1] = poparray[1];
            
        }
        
        return output;
    }
}