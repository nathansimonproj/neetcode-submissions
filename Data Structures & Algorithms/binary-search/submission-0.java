class Solution {
    public int search(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;
        


        /*

            [-1,0,2,4,6,8]

        */
    }
}
