class Solution {
    public void dfs(int i,int j,boolean[][]vis,char[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || grid[i][j]!='1'){
            return;
        }
        // mark it visited
        vis[i][j]=true;
        // calls
        dfs(i-1,j,vis,grid);
        dfs(i,j-1,vis,grid);
        dfs(i+1,j,vis,grid);
        dfs(i,j+1,vis,grid);
    }
    public int numIslands(char[][] grid) {
        int islands=0;
        int n=grid.length;
        int m= grid[0].length;
        boolean[][]vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    islands++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return islands;

        
    }
}