class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l[]=new int[nums.length];
        l[0]=1;
        for(int i=1;i<nums.length;i++){
            l[i]=nums[i-1]*l[i-1];
           // System.out.print(l[i]+" ");
        }
        int r[]=new int[nums.length];
        r[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            r[i]=nums[i+1]*r[i+1];
             System.out.print(r[i]+" ");
        }
        
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=l[i]*r[i];
        }

        return ans;
    }
}