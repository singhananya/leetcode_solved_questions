class Solution {
    public class Edge{
        int  src,nbr;
        Edge(int src,int nbr){
            this.src=src;
            this.nbr=nbr;
        }
    }
    public void dfs(ArrayList<Edge>[] graph,boolean[] vis,int src){
        vis[src]=true;
        for(Edge e:graph[src]){
            if(vis[e.nbr]!=true){
                dfs(graph,vis,e.nbr);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, res = 0;
        ArrayList<Edge>[] graph=new ArrayList[n];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1)
                {
                    int v1=i; int v2=j;
                    graph[v1].add(new Edge(v1,v2));
                    graph[v2].add(new Edge(v2,v1));
                }
            }
        }
        for(int i=0;i<n;i++){
           if(visited[i]!=true){
               dfs(graph,visited,i);
               res++;
           }
        }
        return res;
        
    }
}