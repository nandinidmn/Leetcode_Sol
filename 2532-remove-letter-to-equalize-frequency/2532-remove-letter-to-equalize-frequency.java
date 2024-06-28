class Solution {
    public boolean equalFrequency(String word) {
        int a[]=new int[26];
        for(int i=0;i<word.length();i++){
            a[word.charAt(i)-'a']++;
        }
       for(int i=0;i<26;i++){
        a[i]--;
        if(equal(a))return true;
        a[i]++;
       }
       return false;
    }
    public boolean equal(int []a){
        int last=0;
        for(int i:a){
            if(i==0)continue;
            if(last!=0 && i!=last)return false;
            last=i;
        }
        return true;
    }
}