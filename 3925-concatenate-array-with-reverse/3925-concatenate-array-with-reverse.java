class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] res = new int[n * 2];
        int i = 0;
        int j = 0;

        while(j < n * 2) {
            if(i < n) {
                res[j] = nums[i];
                i++;
                j++;
            } else {
                res[j] = nums[2 * n - 1 - j];
                j++;
            }
        }

        return res;
    }
}