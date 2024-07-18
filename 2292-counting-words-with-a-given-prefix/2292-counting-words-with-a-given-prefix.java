class Solution {
    public int prefixCount(String[] words, String pref) {
        int ct=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                ct++;
            }
        }
        return ct;
    }
}