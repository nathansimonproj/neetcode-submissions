class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            duplicates.add(nums[i]);
            if(duplicates.size() != i+1) {
                return true;
            }
        }

        return false;
    }
}