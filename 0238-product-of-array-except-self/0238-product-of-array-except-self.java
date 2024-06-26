class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=1;
        }
        int l=1;
        for(int i=0;i<n;i++){
            a[i]=l;
            l*=nums[i];
        }
        int r=1;
        for(int i=n-1;i>=0;i--){
            a[i]*=r;
            r*=nums[i];
        }

        return a;

    }
}