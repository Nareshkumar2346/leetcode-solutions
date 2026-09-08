class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str= words[i];
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                set.add(ch);
            }
            if(set.contains(x)) res.add(i);
        }
        return res;
    }
}