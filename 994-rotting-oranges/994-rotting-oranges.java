class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        LinkedList<Integer> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    fresh++;
                if(grid[i][j]==2)
                    q.addLast(i*m+j);
            }
        }
        if(fresh==0)
            return 0;
        int level=0;
        int dirs[][]={{0,1},{0,-1},{1,0},{-1,0}};
        while(q.size()>0){
           int size=q.size();
            while(size-->0){
                int idx=q.removeFirst();
                int i=idx/m;
                int j=idx%m;
                
                for(int []dir:dirs){
                    int x=i+dir[0];
                    int y=j+dir[1];
                    if(x>=0 && y>=0 && x<n && y<m && grid[x][y]==1){
                        grid[x][y]=2;
                        fresh--;
                    
                    if(fresh==0)
                        return level+1;
                    q.addLast(x*m+y);
                    }
                }
            }
            level++;
        }
        return -1;
        
    }
}