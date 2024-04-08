class Solution {
    public int lengthOfLastWord(String s) {

        String str = s.trim();// it will remove any leading and trailing spaces. Ex :"   fly me   to   the moon  "
                             // will become "fly me   to   the moon", it will help in counting no. of last word.
            
            int count =0;
            
            for(int i= str.length()-1; i>=0 ; i--){
                
                if(str.charAt(i) == ' '){
                    
                    break;
                }
                count++;
            }
        return count;
        
    }
}