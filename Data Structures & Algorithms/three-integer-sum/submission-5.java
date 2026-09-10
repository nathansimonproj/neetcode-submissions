class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums); //O(nlogn)
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            int target = -(nums[i]);

            int l = i+1;
            int r = nums.length - 1;

            while(l < r) {
                
                int sum = nums[l] + nums[r];

                if(sum == target) {
                    List<Integer> curr = new ArrayList<>();

                    curr.add(-target);
                    curr.add(nums[l]);
                    curr.add(nums[r]);

                    if(!ans.contains(curr)) {
                        ans.add(curr);
                    }

                    l++;

                }

                if(sum < target) {
                    l++;
                }

                else if(sum > target) {
                    r--;
                }
            }
        }

        return ans;

        
    }

    /*

        sort array
        iterate through each num
            l, r through remaining elements for two elements that add to -(target)

    */
}
