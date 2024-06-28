class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),i);
        }
        System.out.print(h);
        int ans=0;
        for(int i=0;i<s.length();i++){
         if(h.containsKey(t.charAt(i))){
            ans+=Math.abs(h.get(t.charAt(i))-i);
         }
        }
        return ans;
    }
}