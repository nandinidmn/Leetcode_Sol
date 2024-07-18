class Solution {
    public int maxRepeating(String sequence, String word) {
        int ct=0;
        StringBuilder b=new StringBuilder(word);
        while(sequence.contains(b)){
            ct++;
            b=b.append(word);
        }
        return ct;
    }
}