class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n : nums) {
            s.add(n);
        }

        int max = 0;
        for(int n : nums) {

            int curr = 0;
            if(s.contains(n - 1)) {
                continue;
            }

            while(s.contains(n + curr)) {
                curr++;
            }

            max = Math.max(max, curr);

        }

        return max;
    }

    /*

        brute force, start at each thing and loop through

        optimized, if left neighbor exists, continue, otherwise loop through

    */
}
