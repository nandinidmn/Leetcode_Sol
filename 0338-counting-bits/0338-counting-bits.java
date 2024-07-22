class Solution {
    public int check(String n){
      int c=0;
      for(char i:n.toCharArray()){
         if(i=='1')c++;
      }
      return c;
    }
    public int[] countBits(int n) {
        int [] a=new int[n+1];
        for(int i=0;i<=n;i++){
            a[i]=check(Integer.toBinaryString(i));
          //  System.out.println(Integer.parseInt(Integer.toBinaryString(i)));
        }
        return a;
    }
}