class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            s.add(i);
        }

        int max = 0;
        for(int i : nums) {
            if(s.contains(i-1)) {
                continue;
            }

            int curr = 1;
            while(s.contains(i + curr)) {
                curr++;
            }

            max = Math.max(curr, max);
        }

        return max;
    }
}
