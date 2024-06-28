class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int a[]=new int[128];
       int ct=0;
       for(int i=0;i<stones.length();i++){
       a[stones.charAt(i)]++;
       }
       for(int i=0;i<jewels.length();i++){
        ct+=a[jewels.charAt(i)];
       }
       return ct;
    }
}