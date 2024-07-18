class Solution {
    public List<Integer> lexicalOrder(int n) {
        String a[]=new String[n];
        for(int i=1;i<=n;i++){
            a[i-1]=String.valueOf(i);
        }
        Arrays.sort(a);
        List<Integer> l=new LinkedList<>();
        for(String i:a){
            l.add(Integer.parseInt(i));
        }
        return l;
    }
}