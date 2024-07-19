class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("-")){
                a-=1;
            }else if(operations[i].contains("+")){
                a+=1;
            }
        }
        return a;
    }
}