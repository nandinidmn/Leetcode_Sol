class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())return List.of();

        ArrayList<Integer> a=new ArrayList<>();
        int n=p.length();
        int[] f=new int[26],f1=new int[26];
        for(int i=0;i<n;i++){
            f[p.charAt(i)-'a']++;
            f1[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(f,f1)) a.add(0);

        for(int i=n;i<s.length();i++){
             f1[s.charAt(i-n)-'a']--;
             f1[s.charAt(i)-'a']++;
             if(Arrays.equals(f,f1)) a.add(i-n+1);
        }
        return a;
    }
}