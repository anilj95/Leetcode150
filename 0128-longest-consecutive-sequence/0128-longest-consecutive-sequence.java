class Solution {
    public int longestConsecutive(int[] nums) {
        
        //use hashmap for saving all no.s and markingas false initialy, if visited maras true.
        // we will iterate over nums array, inside 2 while loops one for next elemnts and other for previous element
        // and keep pdating current length for every element and assign to longest length ; at last return it.
        
        HashMap<Integer,Boolean> hm = new HashMap<>();
        
        for( int i : nums){
            
            hm.put(i, false);
        }
        
        int longest = 0;
        
        for(int num : nums){
            
            int currentLength = 1; // each characcter has 1 length
            
            // check in forward direction
            
            int next= num+1;
            
            while(hm.containsKey(next) && hm.get(next) == false){
                
                currentLength++;
                
                hm.put(next, true);
                // move to next number
                next++;
            }
            
            // check in reverse direction
            
            int prev= num-1;
            
            while(hm.containsKey(prev) && !hm.get(prev)){
                
                currentLength++;
                
                hm.put(prev, true);
                
               // move in backward direction 
                prev--;
                
            }
                  
                  longest = Math.max(longest, currentLength);
            
        }
        return longest;
        
    }
                  
                  
}