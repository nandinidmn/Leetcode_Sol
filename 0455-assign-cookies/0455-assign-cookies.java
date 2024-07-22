class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int ci=0;int co=0;;
       while(ci<g.length && co<s.length){
        if(g[ci]<=s[co]){ci++;}
        co++;
       }
       return ci;
    }
}