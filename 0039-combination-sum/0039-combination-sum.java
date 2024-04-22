class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
     List<List<Integer>> subset = new ArrayList();
        
        getsubsets(0,candidates, new ArrayList(), subset,target);
        
        return subset;
        
    }
    
    void getsubsets(int start, int[] nums , List<Integer> curr, List<List<Integer>> subset, int target){
        
        if( target == 0){
          subset.add(new ArrayList(curr));  
            
        }
        
        if(target<0){
            
            return;
        }
        
        for(int i = start ; i< nums.length; i++){
            
            curr.add(nums[i]);
            getsubsets(i, nums, curr, subset,target-nums[i]);
            curr.remove(curr.size()-1);
        }
    }
}