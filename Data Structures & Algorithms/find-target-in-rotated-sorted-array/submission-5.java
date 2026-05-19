class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            
            int mid = l + (r-l)/2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[l] <= nums[mid]) {
                //left half is sorted --> check whether in bounds

                if(target < nums[mid] && target >= nums[l]) {
                    //binary search this half
                    r = mid - 1;
                }
                else {
                    //not in left half
                    l = mid + 1;
                }
            }
            else {
                //right is sorted --> check whether in bounds

                if(target > nums[mid] && target <= nums[r]) {
                    //binary search right half
                    l = mid + 1;
                }
                else {
                    //not in right half
                    r = mid - 1;
                }
            }
        }

        return -1;
    }



    /*
        split the array --> one half sorted, one half unsorted

        check whether the target is in the sorted half, recurse on appropriate half
    */
}
