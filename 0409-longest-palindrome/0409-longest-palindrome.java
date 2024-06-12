class Solution {
    public int longestPalindrome(String s) {
      int c[] =new int[128];
      for(char c1:s.toCharArray()){
        c[c1]++;
      }
    int r=0;
      for(int ct:c){
      r+=ct/2 *2;
      if(r%2==0 && ct%2==1){
        r+=1;
      }
      }
      return r;
    }
}