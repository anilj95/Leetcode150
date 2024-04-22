class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList();
        
        res.add(new ArrayList()); // adding first empty set
        
        for(int num : nums){
            
            int n = res.size();// calculating size of dynamically changing arraylist.
            
            for(int i = 0; i<n ;i++){
                
                List<Integer> temp = new ArrayList(res.get(i));// getting the sussets which we have added to res.
                
                temp.add(num); // adding current no. to temp subset: Ex: [] -> [] [1] for 1 no. -> [2] [1,2] for 2 number.                                
                
                res.add(temp); //added back to res, with new subsets. // Total : [],[1],[2],[1,2] and so on...
                
            }
        }
        
        return res;
        
    }
}