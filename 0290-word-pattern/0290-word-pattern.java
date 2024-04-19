class Solution {
    public boolean wordPattern(String pattern, String s) {

        //just like is Isomorphic,we have to create a map of char and string and match
        
        String[] str = s.split(" ");
        
        //basic check if pattern and str length is equal
        
        if(pattern.length() != str.length) return false;
        
        HashMap<Character,String> map = new HashMap<>();
        
        for(int i = 0; i< str.length; i++){
            
            
            if(!map.containsKey(pattern.charAt(i))){
                
                if(!map.containsValue(str[i])){
                    
                    map.put(pattern.charAt(i), str[i]); // if key,value; both absent : insert the value
                    
                }else{// if key is not present but value is present return false.
                    
                    return false;
                }
            }else{// if key is present, need to check if past value and present value is equal
                
               String pastValue = map.get(pattern.charAt(i));
               String presentValue = str[i]; 
                
                if(!pastValue.equals(presentValue)){
                    
                    return false;
                }
                
                
                
            }
        }   
        
        return true;
    }
}

