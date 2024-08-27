class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s=new Stack<>();
        for(int c:a){
            boolean destroyed=false;
            while(!s.isEmpty() && s.peek()>0 && c<0){
                if(s.peek()<-c){
                    s.pop();
                    continue;
                }
               else if(s.peek()==-c){
                    s.pop();
                }
                destroyed=true;
                break;

            }
            if(!destroyed){
                s.push(c);
            }
        }
        return s.stream().mapToInt(i-> i).toArray();
    }
}