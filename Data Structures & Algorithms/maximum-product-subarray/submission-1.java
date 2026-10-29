class Solution {
    public int maxProduct(int[] nums) {
        

        int p = 1;
        int n = 1;

        int max = nums[0];

        for(int i : nums) {


            int temp = p;

            p = Math.max(Math.max(i * p, i * n), i);


            n = Math.min(Math.min(i * temp, i * n), i);

            max = Math.max(max, p);
        }

        return max;
    }
}

/*

    kadanes alg modified

        product --> pos or neg

        keep track of maxP, maxN

        pos = max ( neg * curr, pos * curr, curr)

        neg = min(neg * curr, pos * curr, curr)

        max = max, pos


    [2,4,-3,5]

    p = -3

    n = -3

    m = 8

*/
