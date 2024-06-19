class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>=2){
               a.add(e.getKey());
               a.add(e.getKey());
            }else{
                 a.add(e.getKey());
            }

        }
        Collections.sort(a);
       
        for(int i=0;i<a.size();i++){
            nums[i]=a.get(i);
        }
        return a.size();
    }
}