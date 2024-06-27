class Solution {
    public boolean wordPattern(String p, String s) {
        String a[]=s.split(" ");
        if(p.length()!=a.length)return false;

        HashMap<Character,String> h=new HashMap<>();
        for(int i=0;i<a.length;i++){
            char c=p.charAt(i);
        if(h.containsKey(c)){
            if(!a[i].equals(h.get(c)))return false;
        }else{
            if(h.containsValue(a[i])){
                return false;
            }else{
                 h.put(c,a[i]);
            }
           
        }
        }
        return true;
    }
}