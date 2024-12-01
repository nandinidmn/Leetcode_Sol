class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
       int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
         a[i][j]=arr[j][i];
    }
    }
     for(int i=0;i<n;i++){
         int l=0;
         for(int j=n-1;j>=0;j-- ){
        arr[i][l]=a[i][j];
        l++;
    }
    }
   
    
    }
}