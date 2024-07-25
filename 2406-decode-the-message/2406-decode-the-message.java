class Solution {
    public String decodeMessage(String key, String message) {
     Map<Character,Character> h=new HashMap<>();
        key=key.replaceAll(" ","");int j=97;
        for(int i=0;i<key.length();i++){
         if(h.containsKey(key.charAt(i))){
            continue;
         }
         else{
            h.put(key.charAt(i),(char)j);j++;
         }
        }
        System.out.print(h);
 String ans="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                ans+=" ";
            }else{
                ans+=h.get(message.charAt(i));
            }
        }
        return ans;
    }
}