class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n=nums.length;
        int m=pattern.length;
        int ct=0;
        for(int i=0;i<=n-m-1;i++){
            boolean val=true;
            for(int k=0;k<m;k++){
                if(nums[i + k + 1] <= nums[i + k] && pattern[k] == 1){
                    val=false;
                    break;
                }
                else if(nums[i + k + 1] != nums[i + k] && pattern[k] == 0){
                    val=false;
                    break;
                }
                else if(nums[i + k + 1] >= nums[i + k] && pattern[k] == -1){
                    val=false;
                    break;
                }
            }
            if(val)ct++;
        }
        return ct;
    }
}