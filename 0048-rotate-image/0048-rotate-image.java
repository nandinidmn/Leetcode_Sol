class Solution {
    public void rotate(int[][] matrix) {
        int[][] a=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              a[i][j]=matrix[j][i];
              System.out.print(a[i][j]);
            }
            System.out.println();
        }
       
        for(int i=0;i<matrix.length;i++){ int l=0;
            for(int j=matrix[0].length-1;j>=0;j--){
                matrix[i][l]=a[i][j];
                l++;
            }
        }
     //   System.out.print(a);
    }
}