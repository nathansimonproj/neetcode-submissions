class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, target, 0, 0, ans, curr);
        return ans;
    }

    private void backtrack(int[] nums, int target, int total, int i, List<List<Integer>> ans, List<Integer> curr) {

        if(i >= nums.length) {
            return;
        }
        if(total > target) {
            return;
        }
        if(total == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        backtrack(nums, target, total, i + 1, ans, curr);

        //add curr element
        curr.add(nums[i]);
        backtrack(nums, target, total += nums[i], i, ans, curr);
        curr.remove(curr.size() - 1);

        //move to next element
        

    }
}

/*

    base
        idx >= nums.length --> return
        total >= target --> return

        total == target --> append, return


    recursive case
        add curr element
            idx doesnt change
        skip curr element
            increment idx

*/
