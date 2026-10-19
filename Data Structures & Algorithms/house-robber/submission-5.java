class Solution {
    public int rob(int[] nums) {
        
        int l = 0;
        int ll = 0;

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.max(nums[i] + ll, l);

            ll = l;
            l = nums[i];
        }

        return nums[nums.length - 1];
    }
}
