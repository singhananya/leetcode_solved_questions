class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        
        int[][]directions={{-1,0},{1,0},{0,-1},{0,1}};
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans+=4;
                    for(int[]dir: directions){
                        int x=i+dir[0];
                        int y=j+dir[1];
                        if(x>=0 && y>=0 && x<n && y<m && grid[x][y]==1){
                            ans--;
                        }
                    }
                }
                
                
            }
        }
        
        return ans;
        
    
    }
}