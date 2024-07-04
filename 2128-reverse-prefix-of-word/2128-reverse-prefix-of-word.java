class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch)+1;
        StringBuilder r=new StringBuilder(word.substring(0,i));
        r=r.reverse();
        return r.toString()+word.substring(i);
    }
}