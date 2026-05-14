class Solution {
    public void moveZeroes(int[] nums) {
        
        int insertLocation = 0;
        for(int i : nums) {
            if(i != 0) {
                nums[insertLocation] = i; 
                insertLocation++;
            }
        }

        for(int i = insertLocation; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}