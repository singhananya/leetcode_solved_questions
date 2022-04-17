class Solution {
    public int cs_memo(int n,int[] dp){
        if(n==0){
            dp[n]=1;
            return dp[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ans=0;
        ans+=cs_memo(n-1,dp);
        if(n-2>=0){
          ans+=cs_memo(n-2,dp);  
        }
        dp[n]=ans;
        return ans;
    }
    public int climbStairs(int n) {
       int[] dp=new int[n+1];
        return cs_memo(n,dp);
    }
}