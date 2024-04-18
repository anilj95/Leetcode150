class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // 1st load all unique no. inside HashMap, then check if dupicate comes, find last index of duplicate and subtract
        // with present index if <= k retun true else add to map, coz key is same but this time index is updated to search
        // for further deplicate which met the criteria of<=k.
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0; i< nums.length;i++){
             
            if(!hm.containsKey(nums[i])){
                
                hm.put(nums[i],i);
            }else{
                
                int pastIndex = hm.get(nums[i]);
                
                if(Math.abs(pastIndex - i)<=k){
                    
                    return true;
                }else {
                    
                    hm.put(nums[i],i);
                }
            }
            
        }
        
        return false;
    }
}