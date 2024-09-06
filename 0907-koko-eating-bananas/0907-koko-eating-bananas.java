class Solution {
    public boolean cando(int [] piles,int h,int mid){
        int hr=0;
        for(int p:piles){
            hr+=(int)Math.ceil((double)p/mid);
        }
        return hr<=h;    }
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int p:piles){
            max=Math.max(p,max);
        }

        while(min<max){
            int mid=(min+max)/2;
            if(cando(piles,h,mid)){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
}