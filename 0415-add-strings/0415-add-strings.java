class Solution {
    public String addStrings(String num1, String num2) {
       int i=num1.length()-1;
       int j=num2.length()-1;
       int c=0;
       StringBuilder st=new StringBuilder();
       while(i>=0 || j>=0 || c>0){
        int a=(i>=0)?num1.charAt(i)-'0':0;
        int b=(j>=0)?num2.charAt(j)-'0':0;
        int s=a+b+c;
        c=s/10;
        st=st.append(s%10);
        i--;j--;
       }
       return st.reverse().toString();
    }
}