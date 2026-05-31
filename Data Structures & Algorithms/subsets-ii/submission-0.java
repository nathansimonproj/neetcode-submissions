class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);

        dfs(nums, ans, curr, 0);
        return ans;
    }

    private void dfs(int[] nums, List<List<Integer>> ans, List<Integer> curr, int idx) {

        if(idx >= nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        dfs(nums, ans, curr, idx + 1);
        curr.remove(curr.size() - 1);

        //skip
        while(idx < nums.length - 1 && nums[idx] == nums[idx + 1]) {
            idx++;
        }
        dfs(nums, ans, curr, idx + 1);
    }

    /*

        combinations

        either pick, or if skip skip everything


        dfs

            base
                idx >= nums.length

            recursive case
                add
                    add
                    recurse
                    backtrack
                
                skip
                    skip all
                    recurse

    */
}
