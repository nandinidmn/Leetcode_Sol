class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st=new Stack<>();
        Stack<Integer> c=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()>0 && st.peek()==s.charAt(i))c.push(c.peek()+1);
            else c.push(1);
            st.push(s.charAt(i));
            if(c.peek()==k){
                for(int i1=0;i1<k;i1++){
                    c.pop();
                    st.pop();
                }
            }
        }
        StringBuilder b=new StringBuilder();
        while(st.size()>0){
            b.append(st.peek());
            st.pop();
        }
        return b.reverse().toString();
    }
}