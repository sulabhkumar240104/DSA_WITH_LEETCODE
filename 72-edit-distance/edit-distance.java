class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        return solvetab(word1,word2,m,n);
    }
    public int solvetab(String s1,String s2,int m,int n){
        // create dp
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int insertop=dp[i][j-1];
                    int deleteop=dp[i-1][j];
                    int removeop=dp[i-1][j-1];
                    dp[i][j]=1+Math.min(insertop,Math.min(deleteop,removeop));
                }
            }
        }
        return dp[m][n];
    }
}