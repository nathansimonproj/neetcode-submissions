class Solution {
    public int trap(int[] height) {

        int[] leftMaxArr = new int[height.length];
        int[] rightMaxArr = new int[height.length];

        int leftMax = 0;
        for(int i = 0; i < height.length; i++) {
            
            leftMax = Math.max(leftMax, height[i]);
            leftMaxArr[i] = leftMax;
        }

        int rightMax = 0;
        for(int i = height.length - 1; i >= 0; i--) {

            rightMax = Math.max(rightMax, height[i]);
            rightMaxArr[i] = rightMax;
        }

        int total = 0;
        for(int i = 0; i < height.length; i++) {

            total += Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];
        }

        return total;
    }
}

/*

    1. create l max array
    2. create a r max array
    3. create a water array
    4. sum through the water array

    water[i] = min(lMax, rMax) - height[i]  

*/
