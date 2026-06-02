class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int curr = 0;
            for(int j = i; j < nums.length; j++) {
                curr += nums[j];
                max = Math.max(max, curr);
            }
        }

        return max;
    }

    /*

        sliding window

        start l, r at inx = 0


        expand until less than max

        shrink until more than max

    */

    /*

        brute force solution

            loop through every possible starting index

    */
}
