class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        dfs(candidates, target, 0, ans, curr);
        return ans;
    }

    private void dfs(int[] candidates, int target, int i, List<List<Integer>> ans, List<Integer> curr) {

        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i >= candidates.length || target < 0) {
            return;
        }
        curr.add(candidates[i]);
        dfs(candidates, target - candidates[i], i + 1, ans, curr);
        curr.remove(curr.size() - 1);

        while(i < candidates.length - 1 && candidates[i] == candidates[i + 1]) {
            i++;
        }
        dfs(candidates, target, i + 1, ans, curr);
    }
}
