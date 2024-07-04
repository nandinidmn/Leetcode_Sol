class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        int v=0,ct=0,d=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||c=='u' || c=='U' ){
                v++;
            }
            else if((c>=65 && c<=90) || (c>=97 && c<=122)){
                ct++;
            }
            else if(c>=48 && c<=57){
                continue;}
                else {
                return false;
            }
        }
        if(ct>=1 && v>=1)return true;
        else return false;
    }
}