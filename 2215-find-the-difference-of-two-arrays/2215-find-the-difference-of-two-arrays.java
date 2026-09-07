class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for (int n : nums1){
            set1.add(n);
        }
        for (int n:nums2){
            set2.add(n);
        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int n:set1){
            if(!set2.contains(n)){
                l1.add(n);
            }
        }
        for(int n:set2){
            if(!set1.contains(n)){
                l2.add(n);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}