class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        check(res,0,0,"",n);
        return res;
    }
    public void check(List<String> r,int l,int ri,String a,int n){
        if(a.length()==n*2){r.add(a); return;}

         if(l<n){
            check(r,l+1,ri,a+"(",n);
         }
         if(ri<l){
            check(r,l,ri+1,a+")",n);
         }
    }
}