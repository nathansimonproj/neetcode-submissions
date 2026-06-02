class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> mp = new HashMap<>(); //number to index
        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(mp.keySet().contains(diff)) {
                res[0] = mp.get(diff);
                res[1] = i;
                return res;
            }

            mp.put(nums[i], i);
        }

        return res;
    }
}
