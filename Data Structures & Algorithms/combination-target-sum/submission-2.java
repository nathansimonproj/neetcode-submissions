class Solution {

    List<Integer> curr = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(nums, target, 0);

        return res;
    }

    private void dfs(int[] nums, int target, int idx) {

        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(idx >= nums.length || target < 0) {
            return;
        }

        //pick
        curr.add(nums[idx]);
        dfs(nums, target - nums[idx], idx);
        curr.remove(curr.size() - 1);

        //skip
        dfs(nums, target, idx + 1);
        
    }
}

/*

    sum up to target

    cases
        base
            curr == target

            curr > target

        recursive
            add curr val
            skip curr val
        

*/
