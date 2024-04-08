class Solution {
    public String longestCommonPrefix(String[] strs) {
       
       //for this question we will sort the string array : strs = ["flower","flow","flight"]
    // after sorting it will become : strs = ["flight","flow","flower"] ; i<o so, flight comes 1st.
    // no we will check only 1st and last strings of Array, as middle one will be already sorted.

        Arrays.sort(strs);//  gives sorted Strings inside String array
        
        String str1 = strs[0]; // "flight"
        String str2 = strs[strs.length-1]; //"flower"
        
        int index=0;
        
        while(index < str1.length()){
            
            if(str1.charAt(index) == str2.charAt(index)){
                
                index++;
            }else break;
        }
        
        return str1.substring(0,index);

        
    }
    
    
}