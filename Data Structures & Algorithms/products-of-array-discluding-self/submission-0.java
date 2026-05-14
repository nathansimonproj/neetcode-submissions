class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        output[0] = 1;

        int currPrefix = 1;

        for(int i = 0; i < nums.length; i++) {
            output[i] = currPrefix;
            currPrefix *= nums[i];
        }

        int currPostfix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            output[i] *= currPostfix;
            currPostfix *= nums[i];
        }

        return output;
    }
}  
