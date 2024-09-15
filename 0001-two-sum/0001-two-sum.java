class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=target-nums[i];
            if(nm.containsKey(c)){
                return new int[]{nm.get(c),i};
            }
            nm.put(nums[i],i);
        }
        return new int[]{};
    }
}