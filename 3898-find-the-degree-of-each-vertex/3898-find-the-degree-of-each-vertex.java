class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int[] dum=matrix[i];
            int count=0;
            for(int j=0;j<n;j++){
                count+=dum[j];
            }
            res[i]=count;
        }
        return res;
    }
}