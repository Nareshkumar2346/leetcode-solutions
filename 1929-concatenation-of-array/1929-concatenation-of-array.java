class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[n*2];
        int j=0;
        int i=0;
        while(j<n*2){
            if(i>=n) i=0;
            res[j]=nums[i];
            j++;
            i++;
        }
        return res;
    }
}