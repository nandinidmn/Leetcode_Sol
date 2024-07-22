class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList <Integer> a=new ArrayList<>();
    Set<Integer> h=new HashSet<>();
    for(int i:nums1){
        h.add(i);
    }
    Set<Integer> h1=new HashSet<>();
    for(int i:nums2){
        h1.add(i);
    }
    for(int i:h1){
        if(h.contains(i)) a.add(i);
    }
    return a.stream().mapToInt(Integer::intValue).toArray();
    }
}