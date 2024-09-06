class Solution {
    public void merge(int n[],int l,int h,int m){
        int lt=l;
        int rt=m+1;
        ArrayList<Integer> t=new ArrayList<>();
        while(lt<=m && rt<=h){
        if(n[lt]<=n[rt]){
            t.add(n[lt]);
            lt++;
        }else{
            t.add(n[rt]);
            rt++;
        }
        }

        while(lt<=m){
            t.add(n[lt]);
            lt++;
        }
        
        while(rt<=h){
            t.add(n[rt]);rt++;
        }

        for(int i=l;i<=h;i++){
            n[i]=t.get(i-l);
        }
    }
    public int count(int [] n ,int l,int m,int h){
        int r=m+1;int c=0;
        for(int i=l;i<=m;i++){
            while(r<=h && n[i]>(2*(long)n[r]))
                r++;
            
            c+=(r-(m+1));
        }
        return c;
    }
    public int mergesort(int[] n, int l,int h){
        int c=0;
        if(l>=h)return c;
        int m=(l+h)/2;
        c+=mergesort(n,l,m);
        c+=mergesort(n,m+1,h);
        c+=count(n,l,m,h);
        merge(n,l,h,m);
        return c;
    }
    
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}