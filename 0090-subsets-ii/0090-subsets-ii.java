class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
         getsubsets(0,nums, new ArrayList(), res);
        
        return res;
   
    }
    
    void getsubsets(int start, int[] nums, List<Integer> curr, List<List<Integer>> subsets){
        
         subsets.add(new ArrayList(curr)); //[]
        for(int i = start; i< nums.length ; i++){
            
            if(i> start && nums[i] == nums[i-1]) continue; // condn for i>1st position & no duplicate allowed
            curr.add(nums[i]); //[1]
            getsubsets(i+1, nums, curr,subsets);
            curr.remove(curr.size()-1); //[] 1 is remove in 1st iteration
        }
    }
}