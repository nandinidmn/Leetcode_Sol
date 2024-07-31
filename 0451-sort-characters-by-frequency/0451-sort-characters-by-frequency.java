class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> h=new HashMap<>();
       for(int i=0;i<s.length();i++){
        h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
       }


       HashMap<Character, Integer> temp
            = h.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getValue().compareTo(
                                  i2.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
       String ans="";
      
       for(Map.Entry<Character,Integer> e:temp.entrySet()){
        int n=e.getValue();
        while(n!=0){
            ans+=e.getKey();
            n--;
        }
       }
       StringBuilder k=new StringBuilder(ans);
       return k.reverse().toString();
    }
}