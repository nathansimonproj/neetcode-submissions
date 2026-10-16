class Solution {
    public int[][] divideArray(int[] nums, int k) {

        Arrays.sort(nums);

        int[][] res = new int[nums.length / 3][3];

        //validate
        for(int i = 0; i < nums.length; i += 3) {

            if(nums[i + 2] - nums[i] > k) {
                return new int[0][];
            }
        }

        //group
        for(int i = 0; i < nums.length; i++) {

            int group = i / 3;
            int idx = i % 3;

            res[group][idx] = nums[i];
        }

        return res;
    }
}


/*

    nums into groups of 3

    largest ans smallest vals differ by at most k


    sort, group, validate

*/
