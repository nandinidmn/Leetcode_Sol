class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> h=new HashMap<>();
        for(String a: strs){
            char c[]=a.toCharArray();Arrays.sort(c);
            String sorted=new String(c);
            if(!h.containsKey(sorted)){
                h.put(sorted,new ArrayList<>());
            }
            h.get(sorted).add(a);
        }
        return new ArrayList<>(h.values());

    }
}