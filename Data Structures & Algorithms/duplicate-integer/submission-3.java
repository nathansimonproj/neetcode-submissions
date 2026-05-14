class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if(set.size() != i + 1) {
                return true;
            }
        }

        return false;
    }
}