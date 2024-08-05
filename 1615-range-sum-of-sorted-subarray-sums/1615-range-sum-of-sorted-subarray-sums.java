class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int MOD = 1000000007;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){int s=nums[i];l.add(s);
           for(int j=i+1;j<n;j++){
                s+=nums[j];
                l.add(s);
            }
        }
        Collections.sort(l);
        System.out.print(l);
        long ans=0;
        for(int i=left-1;i<right;i++){
         ans=(ans+l.get(i))%MOD;
        }
        return (int)ans;
    }
}