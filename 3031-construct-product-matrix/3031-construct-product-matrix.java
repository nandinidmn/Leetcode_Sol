class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][] l=new int[n][m];
        int [][] r=new int[n][m];
        int t=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                l[i][j]=(int)t;
                t*=(grid[i][j]%12345);
                t%=12345;
            }
        }
        t=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                r[i][j]=(int)t;
                t*=(grid[i][j]%12345);
                t%=12345;
                grid[i][j]=((l[i][j]*r[i][j])%12345);
            }
        }
        return grid;
        
    }
}