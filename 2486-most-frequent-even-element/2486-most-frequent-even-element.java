class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int ans=-1;int v=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getKey()%2==0 && v<e.getValue()){
             ans=e.getKey();
             v=e.getValue();
            }
        }
        return ans;
    }
}