class Solution {
    public int mostWordsFound(String[] sentences) {
        int a=0;
        for(int i=0;i<sentences.length;i++){
           String b[]=sentences[i].split(" ");
           a=Math.max(a,b.length);
        }
        return a;
    }
}