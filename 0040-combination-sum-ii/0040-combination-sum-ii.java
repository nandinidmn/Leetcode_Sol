class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        sum(0,arr,ans,new ArrayList<>(),t);
        return ans;
    }
    public void sum(int idx,int[] arr, List<List<Integer>> ans,List<Integer> temp,int t){
        if(t==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1])continue;
            if(arr[i]>t)break;

            temp.add(arr[i]);
            sum(i+1,arr,ans,temp,t-arr[i]);

            temp.remove(temp.size()-1);
        }
    }
}