class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int i=0;
        int k=0;
        int j=n;
        while(j<nums.length){
            res[i]=nums[k];
            i++;
            res[i]=nums[j];
            j++;
            i++;
            k++;
        }
        return res;
    }
}