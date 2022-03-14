class Solution {
    public void dfs(char[][] grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length;
        grid[i][j]='2';
        //vis[i][j]=true;
        int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && y>=0 && x<n && y<m && grid[x][y]=='1')
                dfs(grid,x,y);
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        //boolean vis[][]=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]=='1'){
                   dfs(grid,i,j);
                   cnt++;
               } 
            }
        }
        return cnt;
    }
}