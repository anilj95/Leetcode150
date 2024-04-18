class Solution {
    public boolean isAnagram(String s, String t) {

        //we are going to use the ASCAI alue of each character-'a' a = 97(smallest ascai value)
        // for Anagram, each character should be present in both string and length should also be same.
        
        int m = s.length();
        int n = t.length();
        
        if(m!=n) return false;
         
        int[] count = new int[26]; // alphabets are max 26 in english.
        
        for(int i = 0;i< m;i++){ //length of m &n should be same for anagram so take m or n it does not matter.
           
            count[s.charAt(i)-'a']++; // by default count will be 0, for each char present inside count array. So I am doing++
            count[t.charAt(i) -'a']--; //all chars present in t string-'a' , suppose : n-a = 13, at 13 position, 0 i.e -1;
            
        }
        // this for loop is used to iterate over all chars inside count and check if value is zero at each position
        
        for(int i = 0;i< count.length; i++){
            
            if(count[i] != 0) return false;
        
        }
        
        return true;

    }
}