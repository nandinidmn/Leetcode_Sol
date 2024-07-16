class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> a=new ArrayList<>();
        Set<String> ans=new HashSet<>();
        for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            if(words[i]!=words[j] && words[j].contains(words[i])){
                ans.add(words[i]);
            }
        }
        }
        for(String i: ans){
            a.add(i);
        }
        return a;
    }
}