class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Set<Integer> picked = new HashSet<>();

        dfs(nums, ans, curr, picked);
        return ans;
    }

    private void dfs(int[] nums, List<List<Integer>> ans, List<Integer> curr, Set<Integer> picked) {

        if(curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i : nums) {
            if(!picked.contains(i)) {
                
                curr.add(i);
                picked.add(i);
                dfs(nums, ans, curr, picked);
                curr.remove(curr.size() - 1);
                picked.remove(i);

            }
        }
    }
}
