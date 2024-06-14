class Solution {
    public int longestValidParentheses(String a) {
        Stack<Integer> s=new Stack<>();int ct=0;int k=1;
            s.push(-1);
            int m=0;
            for(int i=0;i<a.length();i++){
                char c =a.charAt(i);
                if(c=='('){
                    s.push(i);
                }else{
                    s.pop();
                    if(s.isEmpty()){
                        s.push(i);
                    }
                    m=Math.max(m,i-s.peek());
                }
            }
            return m;
    }
}