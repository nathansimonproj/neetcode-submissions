class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        //expand until valid

            //shrink while still valid

        int l = 0;
        int r = 0;

        int min = Integer.MAX_VALUE;
        int curr = 0;

        while(r < nums.length) {

            curr += nums[r];

            while(curr >= target) {

                min = Math.min(min, r - l + 1);

                curr -= nums[l];
                l++;
            }

            r++;
        }

        if(min == Integer.MAX_VALUE) {
            return 0;
        }
        
        return min;
    }
}