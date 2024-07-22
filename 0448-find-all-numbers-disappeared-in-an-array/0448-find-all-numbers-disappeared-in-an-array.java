class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Set<Integer> h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        for(int i=1;i<=nums.length;i++){
           if(!h.contains(i)){
            l.add(i);
           }
        }
        return l;
    }
}