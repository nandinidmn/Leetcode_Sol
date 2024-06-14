class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int p=-1;int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=p+1){
                p=nums[i];
            }else{
                m+=(p+1-nums[i]);
                p++;
            }
 
        }
        return m;
    }
}