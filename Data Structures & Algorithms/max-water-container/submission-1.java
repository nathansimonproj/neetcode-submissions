class Solution {
    public int maxArea(int[] heights) {
        

        int max = 0;
        int start = 0;
        int end = heights.length - 1;

        while(start < end) {
            int curr = Math.min(heights[start], heights[end]) * (end - start);
            if(curr > max) {max = curr;}
            if(heights[start] < heights[end]) {start++;}
            else {end--;}
        }

        return max;


    }
}
