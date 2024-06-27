class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        backtrack(nums,0,b,a);
        return a;
    }
    public void backtrack(int nums[],int s,List<Integer> b,List<List<Integer>> a){
        a.add(new ArrayList<>(b));
        for(int i=s;i<nums.length;i++){
            b.add(nums[i]);
            backtrack(nums,i+1,b,a);
            b.remove(b.size()-1);
        }
    }
}