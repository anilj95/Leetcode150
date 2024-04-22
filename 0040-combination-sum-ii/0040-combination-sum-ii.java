class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> subsets = new ArrayList();
        generateSubset(0, candidates, new ArrayList(), subsets, target);
        
        return subsets;
    }
    
    void generateSubset(int start, int[] nums, List<Integer> curr, List<List<Integer>> subsets, int target){
        
        if(target == 0){
             subsets.add(new ArrayList(curr));
            return;
        }
        
        //for avoidind TLE
        
        if(target<0) return;
        
        for(int i= start; i< nums.length; i++){
            
            if( i> start && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
             generateSubset(i+1, nums, curr, subsets, target-nums[i]);// reducing target
            curr.remove(curr.size()-1);
        }
    }
}