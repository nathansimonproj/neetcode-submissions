class Solution {
    public int maxArea(int[] heights) {
        

        int lo = 0;
        int hi = heights.length - 1;
        int maxWater = 0;

        while(lo < hi) {
            //iterate backwards and update maxWater
            int area = Math.min(heights[lo], heights[hi]) * (hi - lo);

            maxWater = area > maxWater ? area : maxWater;

            if(heights[lo] < heights[hi]) {
                lo++;
            }
            else {
                hi--;
            }
        }

        return maxWater;
    }
}
