class Solution {
    public int minIncrementForUnique(int[] nums) {
      int n=nums.length;
      int m=0;
      int mi=0;
      for(int i:nums){
        m=Math.max(m,i);
      }
      int f[]=new int[m+n];
      for(int i:nums){
        f[i]++;
      }

      for(int i=0;i<n+m;i++){
        if(f[i]<=1)continue;
        int duplicate=f[i]-1;
        f[i+1]+=duplicate;
        f[i]=1;
        mi+=duplicate;
      }
      return mi;
      }
}