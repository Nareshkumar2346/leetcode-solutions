class Solution {
    public int findNumbers(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            int cou=0;
            int num=nums[i];
            while (num>0){
                
                num=num/10;
                cou++;
            }
            if(cou%2==0) tot++;
        }
        return tot;
    }
}