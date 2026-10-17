class Solution {
    public int rob(int[] nums) {
        

        //[1, 1, 3, 3]

        int r = 0;
        int rr = 0;

        for(int i = nums.length - 1; i >= 0; i--) {

            nums[i] = Math.max(nums[i] + rr, r);
            rr = r;
            r = nums[i];
            
        }

        return nums[0];
    }
}
