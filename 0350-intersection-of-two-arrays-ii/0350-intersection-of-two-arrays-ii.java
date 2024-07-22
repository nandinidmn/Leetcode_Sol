class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     ArrayList<Integer> a=new ArrayList<>();
      HashMap<Integer,Integer> h=new HashMap<>();
      for(int i : nums1){
          h.put(i,h.getOrDefault(i,0)+1);
      }
      for(int i : nums2){
          if(h.containsKey(i) && h.get(i)>0){
            a.add(i);
            h.put(i,h.get(i)-1);
          }
      }

      return a.stream().mapToInt(Integer::intValue).toArray();
    }
}