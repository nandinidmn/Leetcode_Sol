class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        StringBuilder k=new StringBuilder();
        while(i>=0 || j>=0 || c==1){
           if(i>=0) c+=a.charAt(i--)-'0';
           if(j>=0) c+=b.charAt(j--)-'0';
          k= k.append(c%2);
           c=c/2;
        }
        return k.reverse().toString();
    }
}