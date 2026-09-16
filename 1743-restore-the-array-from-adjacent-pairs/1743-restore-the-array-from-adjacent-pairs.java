class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int[] pair : adjacentPairs) {
            map.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
            map.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
        }

        int start = 0;

        for(int key : map.keySet()) {
            if(map.get(key).size() == 1) {
                start = key;
                break;
            }
        }

        int[] result = new int[adjacentPairs.length + 1];

        result[0] = start;
        int prev = Integer.MIN_VALUE;

        for(int i = 1; i < result.length; i++) {
            for(int next : map.get(start)) {
                if(next != prev) {
                    result[i] = next;
                    prev = start;
                    start = next;
                    break;
                }
            }
        }

        return result;
    }
}