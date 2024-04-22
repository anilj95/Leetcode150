class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
//         //Method 1: Iterative way
        
//         //Total time complexity : for two for loops Tc will be multiple of both for-loops TC : O(n* 2^n)
//         // SC is also same: O(n*2^n)
//         List<List<Integer>> res = new ArrayList();
        
//         res.add(new ArrayList()); // adding first empty set
        
//         for(int num : nums){// TC: n
            
//             int n = res.size();// calculating size of dynamically changing arraylist.
            
//             for(int i = 0; i<n ;i++){ //TC: 2^n // for n given no. total subsets possible = 2^n, for n=3, subsets = 2^3 = 8.
                
//                 List<Integer> temp = new ArrayList(res.get(i));// getting the sussets which we have added to res.
                
//                 temp.add(num); // adding current no. to temp subset: Ex: [] -> [] [1] for 1 no. -> [2] [1,2] for 2 number.                                
                
//                 res.add(temp); //added back to res, with new subsets. // Total : [],[1],[2],[1,2] and so on...
                
//             }
//         }
        
//         return res;
        
        //Method 2: Recursive way
        //TC: O(n* 2^n) : SC = we are using same Arraylist(curr) for adding & removing O(n), We are generating
        // 2^3 subsets and adding inside 'res' so 2^n; Recursion used stack , for n elements , O(n)
        //Total SC: O(n) + O(2^n) + O(n).
        
        List<List<Integer>> res = new ArrayList();
        
         generateSubset(0, nums, new ArrayList(),res);
         
        return res;
    }
    
    void generateSubset(int index, int[] nums, List<Integer> curr , List<List<Integer>> res){ // O(2^n)
        
        res.add(new ArrayList(curr));// added empty set: at first-> []
        
        for(int i = index; i<nums.length;i++){ //TC: O(n)
            
            curr.add(nums[i]); // added [1] : []->[1] for i = 1;
            
            generateSubset(i+1, nums, curr ,res); // going deep down for next element i+1.
            
            curr.remove(curr.size()-1); // recursiion reches at end for i, we need to remove for backtracing.
            
        }
        
    }
}