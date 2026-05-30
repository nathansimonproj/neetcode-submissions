class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, 0, ans, curr);

        return ans;
    }

    private void backtrack(int[] nums, int i, List<List<Integer>> ans, List<Integer> curr) {

        //base case: i == nums.length - 1
        if(i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        //decision tree
        
        // don't add
        backtrack(nums, i + 1, ans, curr);

        //add
        curr.add(nums[i]);
        backtrack(nums, i + 1, ans, curr);
        curr.remove(curr.size() - 1);

        // curr.add(nums[i]);
        // backtrack(nums, i + 1, ans, curr);
        // curr.remove(curr.size() - 1);

        // backtrack(nums, i + 1, ans, curr);
        
        
    }
}
