class Solution {
    public boolean canJump(int[] nums) {
        int g=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=g){
                g=i;
            }
        }
        return g==0;
    }
}