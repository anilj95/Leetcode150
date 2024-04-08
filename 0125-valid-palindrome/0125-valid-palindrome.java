class Solution {
    public boolean isPalindrome(String s) {
        
        
        String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]",""); // return all string without space
        
        int i = 0;
        int j = str.length()-1;
        
        while(i<=j){
            
            if(str.charAt(i++) != str.charAt(j--)) // first char to last char matching.
                return false;
           
        }
        
        return true;
        
    }
}