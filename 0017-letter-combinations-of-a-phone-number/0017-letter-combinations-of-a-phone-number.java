class Solution {
    final static char[][] l={
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'},
    };
    public static List<String> letter(String d){
        int len=d.length();
    List<String> s=new ArrayList<>();
        if(len!=0){
             bsf(0,len, s,"",d);
        }
        return s;
    }
    public static List<String> bsf(int pos,int len,List<String> s, String s1,String d){
        if(pos==len){
            s.add(s1);
        }
        else{
            char let[]=l[Character.getNumericValue(d.charAt(pos))];
            for(int i=0;i<let.length;i++){
                bsf(pos+1,len,s,s1+let[i],d);
            }
        }
       return s;
    }

    public List<String> letterCombinations(String d) {
       return letter(d);
    }
}