class Solution {
    public void dfs(boolean vis[],int idx,int[][] isConnected){
        int [] city=isConnected[idx];
        for(int i=0;i<city.length;i++){
            if(idx==i){
                continue;
            }
            if(city[i]==1 && !vis[i]){
                vis[i]=true;
                dfs(vis,i,isConnected);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int ct=0;
        boolean vis[]=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                vis[i]=true;
                dfs(vis,i,isConnected);
                ct++;
            }
        }
        return ct;
    }
}