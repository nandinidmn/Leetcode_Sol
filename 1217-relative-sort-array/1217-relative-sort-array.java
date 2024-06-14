class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> r=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    r.add(arr1[j]);
                    arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i:arr1){
            if(i!=-1){
                r.add(i);            }
        }
        return r.stream().mapToInt(Integer::intValue).toArray();
    }
}