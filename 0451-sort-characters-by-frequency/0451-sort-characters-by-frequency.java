class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        String ans="";
        while(!h.isEmpty()){
          int max=Integer.MIN_VALUE;
          char c='\0';
          for(Map.Entry<Character,Integer> e:h.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                c=e.getKey();
            }
          }
          for(int i=0;i<max;i++){
            ans+=c;
          }
          h.remove(c);
          
        }
        return ans;
    }
}