class Solution {
    public String largestNumber(int[] nums) {
        if(nums==null || nums.length==0){
            return "";
        }
        String []a1=new String[nums.length];
         for(int i=0;i<nums.length;i++){
            a1[i]=String.valueOf(nums[i]);
         }
        Arrays.sort(a1,(a,b)->(b+a).compareTo(a+b));
        if(a1[0].equals("0"))return "0";

        StringBuilder s=new StringBuilder();
        for(String str: a1){
            s.append(str);
        }
        return s.toString();
    }
}