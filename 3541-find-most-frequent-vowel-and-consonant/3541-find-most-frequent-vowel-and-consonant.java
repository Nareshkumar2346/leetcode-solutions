class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vol=new HashMap<>();
        HashMap<Character,Integer> con=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                vol.put(ch,vol.getOrDefault(ch,0)+1);
            }
            else con.put(ch,con.getOrDefault(ch,0)+1);
        }
        int max1=0, max2=0;
        for(char ch:vol.keySet()){
            max1=Math.max(max1,vol.get(ch));
        }
        for(char ch:con.keySet()){
            max2=Math.max(max2,con.get(ch));
        }
        return max1+max2;
    }
}