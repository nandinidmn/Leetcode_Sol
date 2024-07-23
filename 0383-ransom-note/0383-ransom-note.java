class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] f=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            f[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            f[magazine.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(f[i]>0)return false;
        }
        return true;
    }
}