class Solution {
    public List<Integer> lexicalOrder(int n) {
        return find(n,new ArrayList<Integer>(),1);
    }
    public List<Integer> find(int n, ArrayList<Integer> a,int s){
        if(s>n)return a;
        for(int i=s;i<=s+9;i++){
            if(s==1 && i==10)continue;
            if(i<=n){
                a.add(i);
                find(n,a,i*10);
            }else return a;
        }
        return a;
    }
}