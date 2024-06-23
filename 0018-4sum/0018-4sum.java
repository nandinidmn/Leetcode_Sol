class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
           if(i!=0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
             int k=j+1;
             int l=n-1;
             while(k<l){
             long s=nums[i];
             s+=nums[j];
             s+=nums[k];
             s+=nums[l];
             if(s<t){
                k++;
             }
             else if(s==t){
                List<Integer> b=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                a.add(b);
                k++;
                l--; while(k<l && nums[k]==nums[k-1])k++;
                while(k<l && nums[l]==nums[l+1])l--;
               

             }
             else{
                l--;
             }
            }}
        }

        return a;
    }
}