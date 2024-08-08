class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int a[]=new int[2];
        Set<Integer> h=new HashSet<>();
        for(int i:nums){
            if(h.contains(i)){
                a[0]=i;
            }
                h.add(i);
            
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                a[1]=i;
            }
        }
        return a;
    }
}