class Solution {
    public int findDuplicate(int[] nums) {
        
        //using extra space
        Set<Integer> seen = new HashSet<>();

        for(int i : nums) {
            if(seen.contains(i)) {
                return i;
            }
            seen.add(i);
        }

        return -1;
    }
}
