class Solution {
    public boolean isHappy(int n) {

       // we will use HashSet to check if that no. exist inside or not coz in many cases, if we keep doing power of both chars
        // it will come some no. which will repeat again, clearly it is not happy no. if sum ==1, it is happy no.
        
        HashSet<Integer> hs = new HashSet<>();
        
        while(true){
            
            int sum =0;
           // this loop gives total sum of individual char inside int no. 
            while(n != 0){
                
                sum+= Math.pow(n%10,2); // using power fun of Math class % gives 1st char, 2 is power on 1st char.
                
                n= n/10; // gives last char
            }
            
            if( sum ==1) return true; // condition for ano. being happy
            
            n = sum ; // again assiging to num, for calculating power of both no.s
            
            if(hs.contains(n)){
                
                return false;
            }
            hs.add(n); // add if not present inside hashset
            
            
        }
        
    }
}