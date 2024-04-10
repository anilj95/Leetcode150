class Solution {
    public int lengthOfLongestSubstring(String s) {

        // we are going two use slidig window which requires two pointer left and right
        
        int left =0; int maxlenght = Integer.MIN_VALUE;
        
        //going to Set interfaace for unique character
        
        HashSet<Character> hs = new HashSet<>();
        
        for(int right =0; right<s.length(); right++){
            
            while(hs.contains(s.charAt(right))){
                
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            
            maxlenght = Math.max(maxlenght, right-left+1);
            
            
        }
        
        return maxlenght == Integer.MIN_VALUE ?0 :maxlenght;
        
        
        
    }
}