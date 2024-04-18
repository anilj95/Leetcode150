class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        //Using HashMap for saving magazine char and their occurance
        // now serch like if char of ranson not in map or occurance of char of ransom is <=0 return false
        //else do occurance --
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : magazine.toCharArray()){
            
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(char ch : ransomNote.toCharArray()){
            
            
            if(!map.containsKey(ch) || map.get(ch)<=0){ 
                
                return false;
            }
            
            map.put(ch, map.get(ch)-1); // reducing the occurance
        }
        
        return true;
    }
}