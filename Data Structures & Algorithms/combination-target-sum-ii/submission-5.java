class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(candidates);

        dfs(candidates, target, 0, res, curr);

        return res;
    }

    private void dfs(int[] candidates, int target, int i, List<List<Integer>> res, List<Integer> curr) {

        if(target == 0 && !res.contains(curr)) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        if(target < 0 || i >= candidates.length) {
            return;
        }

        curr.add(candidates[i]);
        dfs(candidates, target - candidates[i], i + 1, res, curr);
        curr.remove(curr.size() - 1);

        int c = candidates[i];

        while(i < candidates.length && candidates[i] == c) {
            i++;
        }
        dfs(candidates, target, i, res, curr);
    }
}

/*

    taken once,

    increment a ptr to curr location in the array
        once skipped, cant go back

        decision tree
            take
            recurse

            undo

            skip

*/
