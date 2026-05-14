class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            s.add(i);
        }

        return s.size() != nums.length;
    }
}