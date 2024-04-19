class Solution {
    public boolean isIsomorphic(String s, String t) {
     
        //take both string for clarity: s = "b a d c" & t = "k i k p"
        
        HashMap<Character,Character> map = new HashMap<>();
        
        //basic check: if length of both is not equal, not isomorphic
        
        if(s.length() != t.length()) return false;
        
        for(int  i =0; i<s.length();i++){
            
            if(!map.containsKey(s.charAt(i))){// if 'b' is not present
                
                if(!map.containsValue(t.charAt(i))){// if 'k' is also not present'
                    
                    map.put(s.charAt(i),t.charAt(i)); // b ->k , a->i :  are mapped
                    
                    
                }else{ // 'd' is not present but 'k' is present
                    
                    return false;
                }
            }else{// here if key is already present; need to check if past value and present value is equal, if not retun false.
                
                char pastValue = map.get(s.charAt(i)); // past value will be inside map
                char presentValue = t.charAt(i); // present value is char at ith position.
                
                if(pastValue != presentValue){
                    
                    return false;
                }
                
            }
        }
        
        
        return true;

    }
    
}
