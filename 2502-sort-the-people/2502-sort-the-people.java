class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> h=new HashMap<>();
        for(int i=0;i<names.length;i++){
            h.put(heights[i],names[i]);
        }
        System.out.print(h);
        Arrays.sort(heights);int j=0;
        String[] a=new String[names.length];
        for(int i=heights.length-1;i>=0;i--){
           a[j]=h.get(heights[i]);j++;
        }
        return a;
    }
}