class Solution {
    public int strStr(String haystack, String needle) {
        
        // suppose needle has 3 char, and if we found 1st char at second last position of haystack
        //there is no point of seerching last two position coz, needle is of 3 chars string.
        // +1 because length of needle is 3, we have to avoid last two chars only so +1.
        // you can search upto haystack.length(), but it is bit optimized.
       
        for(int i =0; i<haystack.length() - needle.length() +1; i++){
            
            if(haystack.charAt(i) == needle.charAt(0)){// if 1st char matches, we will go for whole string
                
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    
                    //here we have done needle.length()+i, suppose we found 1st char at index 4, we have to search
                    // upto 6(4->6 : 3 chars), if needle length is 3 so : 3+i(4) = 7; but substring ignores last char.
                    // so no issue. it will search upto 6 char only i.e 4->6
                    
                    return i;
                } 
            }
            
            
        }
        
        return -1;
        
    }
}

// method 2: using property of indexOf()


// public int solution2(String haystack, String needle){
    
//     return haystack.indexOf(needle); // it will return index or -1 if not available
// }