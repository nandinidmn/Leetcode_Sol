class Solution {
    public int maxRepeating(String sequence, String word) {
        int ct=0;
        StringBuilder b=new StringBuilder();
        b.append(word);
        while(sequence.contains(b)){
            b.append(word);
            ct++;
        }
        return ct;
    }
}