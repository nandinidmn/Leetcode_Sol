class Solution {
    public int[] count(String a){
         int c[]=new int[26];
        for(char c1:a.toCharArray())
        c[c1-'a']++;
        return c;
    }
    public int[] intersection(int[] a,int[] b){
     int t[]=new int[26];
     for(int i=0;i<26;i++){
        t[i]=Math.min(a[i],b[i]);
     }
     return t;
    }
    public List<String> commonChars(String[] words) {
        int [] last=new int[26];
        last=count(words[0]);
        for(int i=1;i<words.length;i++){
            last=intersection(last,count(words[i]));
        }
        List<String> a=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(last[i]!=0){
                char k=(char) ('a'+i);
                while(last[i]>0){
                    a.add(String.valueOf(k));
                    last[i]--;
                }
            }
        }
         return a;
    }
}