class Solution {
    public String minWindow(String s, String t) {
        int c[]=new int[128];
        int len=t.length();
        int finalleft=-1;
        int minlen=s.length()+1;

        for(char c1:t.toCharArray()){
            ++c[c1];
        }
        int left=0;
        for(int i=0;i<s.length();i++){
            if(--c[s.charAt(i)]>=0)
            --len;
            while(len==0){
                if(i-left+1<minlen){
                    finalleft=left;
                    minlen=i-left+1;
                }

                if(++c[s.charAt(left++)]>0)
                ++len;
            }
        }
         return finalleft==-1?"": s.substring(finalleft,finalleft+minlen);
    }
}