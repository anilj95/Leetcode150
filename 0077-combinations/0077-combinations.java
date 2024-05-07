class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        //look for subsets problems, i.e the base of 4-5 problems
        // we will use recursive method
        
        List<List<Integer>> subsets = new ArrayList();
        
        generteSubset(1,n, new ArrayList(), subsets,k);
        
        return subsets;
        
    }
    
    void generteSubset(int start, int n, List<Integer> curr,List<List<Integer>> subsets, int k){
        // we want to return combinations only of size k, if k=2, we will not return any subset of size 1 or 3, only 2. 
        if(curr.size() == k){ // this is extra condn for this problem otherwise code is exactly same.
            
         subsets.add(new ArrayList(curr));// added new subset: ->[1,2], only when above condn met.
            return; // we dont need to add other size subsets, so we will return

        }

        for(int i = start; i<=n;i++){
            
            curr.add(i);
            generteSubset(i+1,n, curr, subsets,k); // for next element i+1, this method will penitrate upto last element->[1,4]
            curr.remove(curr.size()-1); // then remove last element to come back to origin for next element: backtracking
            
        }
        
        
    }
}