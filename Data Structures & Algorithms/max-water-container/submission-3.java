class Solution {
    public int maxArea(int[] heights) {
        

        int max = 0;
        int lo = 0;
        int hi = heights.length - 1;

        while(lo < hi) {
            int area = Math.min(heights[lo], heights[hi]) * (hi - lo);

            max = area > max ? area : max;

            if(heights[lo] < heights[hi]) {
                lo++;
            }
            else {
                hi--;
            }
        }

        return max;
    }
}
