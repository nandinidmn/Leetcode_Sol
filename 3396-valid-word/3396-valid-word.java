class Solution {
    public boolean isValid(String word) {
        if(word.length()<=2)return false;

        String v="aeiouAEIOU";
        int vc=0;
        int cc=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLetter(c)){
                if(v.contains(Character.toString(c))){
                    vc++;
                }else{
                    cc++;
                }
            }
            else if(c=='@' || c=='#' || c=='$'){
                return false;
            }
        }
        if(vc>=1 && cc>=1)return true;
        else
        return false;
    }
}