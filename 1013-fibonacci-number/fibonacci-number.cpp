class Solution {
    int solveMem(int n, vector<int>&dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=solveMem(n-1,dp)+solveMem(n-2,dp);
        return dp[n];
    }
public:
    int fib(int n) {
        vector<int>dp(n+1,-1);
        return solveMem(n,dp);
        
    }
};