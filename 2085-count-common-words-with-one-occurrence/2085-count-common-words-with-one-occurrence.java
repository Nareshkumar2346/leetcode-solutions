class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            String word=words1[i];
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        for(int i=0;i<words2.length;i++){
            String word=words2[i];
            map2.put(word,map2.getOrDefault(word,0)+1);
        }
        for(String ch:map1.keySet()){
            if(map2.containsKey(ch)){
                if(map1.get(ch)==1 && map2.get(ch)==1) count++;
            }
        }
        return count;
    }
}