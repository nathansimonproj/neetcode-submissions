class Solution {
    public int maxSubArray(int[] nums) {
        

        int max = -11000;
        int curr = 0;

        for(int i = 0; i < nums.length; i++) {

            if(i == 0) {
                curr = nums[i];
            }

            else {
                curr = Math.max(curr + nums[i], nums[i]);
            }
            

            max = Math.max(max, curr);
        }

        return max == -11000 ? -1 : max;
    }
}
