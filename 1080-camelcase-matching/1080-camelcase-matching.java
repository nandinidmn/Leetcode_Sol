class Solution {
    public boolean check(char a[],char b[]){
      int i=0;int j=0;
      while(i<a.length && j<b.length){
        if(a[i]==b[j]){
            i++;j++;
        }else if(Character.isUpperCase(a[i])){
            return false;
        }else{
            i++;
        }
      }
      while(i<a.length){
        if(Character.isUpperCase(a[i]))return false;

        i++;
      }

      return j==b.length;
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> a=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            a.add(check(queries[i].toCharArray(),pattern.toCharArray()));
        }
        return a;
    }
}