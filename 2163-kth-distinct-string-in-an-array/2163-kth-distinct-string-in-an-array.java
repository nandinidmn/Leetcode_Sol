class Solution {
    public String kthDistinct(String[] arr, int k) {
        String a="";
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(h.get(arr[i])==1){
                k--;
                if(k==0)a=arr[i];
            }
        }
        
        return a;
    }
}