class Solution {
    public int findMin(int[] nums) {
        /*
            for any rotated sorted array --> partition into a sorted and non sorted half

            identify sorted half, min is the left most part of that --> store in var

            repeat on non sorted half until pointers meet
        */

        int l = 0;
        int r = nums.length - 1;

        int min = Integer.MAX_VALUE;

        while(l <= r) {

            int mid = l + (r-l)/2;

            //determine sorted half
            if(nums[l] <= nums[mid]) {
                //left is sorted, set min and search unsorted half
                min = Math.min(min, nums[l]);
                l = mid + 1;
            }
            else {
                min = Math.min(min, nums[mid]);
                r = mid - 1;
            }
        }

        return min;
    }
}
