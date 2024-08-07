class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>1){
                l.add(e.getKey());
            }
        }
        return l;
    }
}