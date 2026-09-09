class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>(); 
        for(int i : nums) {
            numSet.add(i);
        }

        int max = 0;
        for(int i : nums) {

            if(numSet.contains(i - 1)) {
                continue;
            }

            int curr = 0;
            while(numSet.contains(i)) {
                curr++;
                i++;
            }

            max = Math.max(curr, max);
        }

        return max;
    }

    /*

        only start from nums w no left neighbor i.e. the start of a sequence

    */
}
