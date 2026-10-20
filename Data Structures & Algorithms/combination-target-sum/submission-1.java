class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        dfs(nums, 0, target, res, curr);

        return res;
    }

    private void dfs(int[] nums, int i, int target, List<List<Integer>> res, List<Integer> curr) {

        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0 || i >= nums.length) {
            return;
        }

        //add curr num
        curr.add(nums[i]);
        dfs(nums, i, target - nums[i], res, curr);
        curr.remove(curr.size() - 1);

        dfs(nums, i + 1, target, res, curr);
    }
}
