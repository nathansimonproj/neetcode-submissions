class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        Map<Integer, Integer> idx = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(idx.keySet().contains(diff)) {
                res[0] = idx.get(diff);
                res[1] = i;

                return res;
            }

            idx.put(nums[i], i);
        }

        return res;
    }
}
