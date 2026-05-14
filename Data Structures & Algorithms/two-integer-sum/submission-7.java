class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            brute force solution
            outer loop i
                inner loop starting from i

            O(n^2)
        */

        Map<Integer, Integer> seen = new HashMap<>(); //nums[i] to i, value to index

        for(int i = 0; i < nums.length; i++) {

            //looking for two numbers that add to target
            int diff = target - nums[i];

            if(seen.keySet().contains(diff)) {
                //found our pair
                return new int[] {seen.get(diff), i};
            }

            seen.put(nums[i], i);

        }

        return new int[1];
    }
}
