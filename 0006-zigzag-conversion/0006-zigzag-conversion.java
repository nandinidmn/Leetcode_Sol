class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length())return s;

        int idx=0;int d=1;
        List<Character> [] r=new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            r[i]=new ArrayList<>();
        }
        for(char c: s.toCharArray()){
            r[idx].add(c);
            if(idx==0){
                d=1;
            }else if(idx==numRows-1){
                d=-1;
            }
            idx+=d;
        }

        StringBuilder ans=new StringBuilder();
        for(List<Character> r1: r){
         for(char c:r1){
            ans.append(c);
         }
        }
        return ans.toString();
    }
}