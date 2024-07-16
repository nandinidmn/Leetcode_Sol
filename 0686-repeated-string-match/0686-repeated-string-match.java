class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minrep=(int)Math.ceil(b.length()/a.length());
        for(int i=0;i<=minrep+2;i++){
           String rep=a.repeat(i);
           if(rep.contains(b))return i;
        }
        return -1;
    }
}