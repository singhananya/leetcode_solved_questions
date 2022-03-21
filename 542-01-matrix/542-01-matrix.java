class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        LinkedList<int[]> q=new LinkedList<>();
        //int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0)
                    q.addLast(new int[]{i,j}); 
            }
        }
        int dirs[][]={{1,0},{0,1},{-1,0},{0,-1}};
        boolean vis[][]=new boolean[n][m];
        while(q.size()>0){
            int[] curr=q.remove();
            for(int[] dir:dirs){
                int x=dir[0]+curr[0];
                int y=dir[1]+curr[1];
                if(x>=0 && y>=0 && x<n && y<m && !vis[x][y] && mat[x][y]!=0){
                    mat[x][y]=mat[curr[0]][curr[1]]+1;
                    vis[x][y]=true;
                    q.addLast(new int[]{x,y});
                }
            }
        }
        return mat;
        
    }
}