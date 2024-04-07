class Solution {
    public int climbStairs(int n) {

        if( n== 1) return 1;

        int[] dp = new int[n+1];
        dp[1] = 1; // if 1 steps r there, only 1 way you can climb
        dp[2] = 2; //if 2 steps r there, only 2 way(1: 1+1; 2: 2) you can climb

        for(int i=3;i<=n ;i++){//if 3 steps r there, only 3 way(1: 1+1+1; 2: 1+2; 3: 2+1) you can climb

            dp[i] = dp[i-1] + dp[i-2];

        }
        return dp[n];//if 4 steps r there,5 way you can climb(1st: 1+1+1+1; 2nd: 1+1+2; 3rd: 1+2+1; 4th:2+1+1; 5th:2+2)
        
    }
}