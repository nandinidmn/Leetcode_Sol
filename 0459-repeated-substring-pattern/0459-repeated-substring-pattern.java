class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str="";
        int n=s.length();
        for(int i=1;i<=n/2;i++){
        if(n%i==0){
            str=s.substring(0,i);
            if(s.replace(str,"").isEmpty())return true;
        }
        }
        return false;
    }
}