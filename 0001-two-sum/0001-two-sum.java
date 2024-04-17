class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         // this solution will work if array is sorted: then only 2 pointer approach will work
//         int i = 0; int j = nums.length-1;
        
//         int[] result = new int[2];
        
//         while(i<j){
            
//             if(nums[i] + nums[j] == target){
                
//                 return new int[] {i,j};
//             }else if(nums[i] + nums[j] > target){
                
//                 j--;
//             }else{
//                 i++;
//             }
//         }
        
//         return null;
        
        //now use hashmap and save all values then check ,target-nums[i] from array is present in map
        
        HashMap<Integer,Integer> hm = new HashMap<>(); // if array contains duplicate, we will change to List<Integer> in hashmap 2nd                                                            //parameter
        
        for(int i =0; i< nums.length;i++){
            
            hm.put(nums[i],i);
        }
        
         for(int i =0; i< nums.length;i++){
             
             if(hm.containsKey(target-nums[i])){
                 
                int index = hm.get(target-nums[i]);
                 
                 if(i == index) continue; // special case where it can pick the same element : ex: if target == 4, we have already saves 2
                                          // at 0th position  of hm, index= hm.get(target-nums[i]) , will give 0,i is also 0
                                          // it will return [0,0] as result
                 
                  return new int[] {i, index};
             }
             
              
        }
        
        return null;
        
    }
}