class Solution {
    public int rob(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }
        
        if(nums.length == 1) {
            return nums[0];
        }

        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        return Math.max(max(nums, 0, nums.length - 1), max(temp, 1, nums.length));
        
    }

    //[3, 4, 3]
    public int max(int[] nums, int start, int end) {

        int l = 0;
        int ll = 0;

        for(int i = start; i < end; i++) {
            nums[i] = Math.max(nums[i] + ll, l);
            ll = l;
            l = nums[i];
        }

        return nums[end - 1];
    }
}


/*

    max = i + rr, r

    l --> r

    

    same loop, ptr modulo

*/
