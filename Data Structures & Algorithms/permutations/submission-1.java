class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] picked = new boolean[nums.length];
        // Set<Integer> picked = new HashSet<>();

        dfs(nums, ans, curr, picked);
        return ans;
    }

    private void dfs(int[] nums, List<List<Integer>> ans, List<Integer> curr, boolean[] picked) {

        if(curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {

            if(!picked[i]) {
                
                curr.add(nums[i]);
                picked[i] = true;
                dfs(nums, ans, curr, picked);
                curr.remove(curr.size() - 1);
                picked[i] = false;

            }
        }
    }
}
