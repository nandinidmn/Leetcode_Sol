class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int max=Integer.MAX_VALUE;int ans=0;Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)return sum;
                else if(sum<target)j++;
                else {
                    k--;
                }
                int diff=Math.abs(sum-target);
                if(diff<max){
                    max=diff;
                    ans=sum;
                }
            }
        }
        return ans;
    }
}