class Solution {
    public void dfs(int n,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        vis[n]=true;
     //   dfs.add(n);
        for(Integer i:adj.get(n)){
            if(vis[i]==false){
                dfs(i,vis,adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<isConnected[0].length;i++){
            adj.add(new ArrayList<Integer>());
        } 
        for(int i=0;i<isConnected[0].length;i++){
           for(int j=0;j<isConnected[0].length;j++){
            if(isConnected[i][j]==1 && i!=j){
                adj.get(i).add(j);
                adj.get(j).add(i);
            }
        } 
        } 
      int ct=0;
      boolean vis[]=new boolean[isConnected.length];

      for(int i=0;i<isConnected.length;i++){
        if(vis[i]==false){
            ct++;
            dfs(i,vis,adj);
        }
      }
      return ct;
    }
}