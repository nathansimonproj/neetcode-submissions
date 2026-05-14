class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort the array --> fix a value --> two pointer pproach to target value

        if(nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < nums.length - 2; i++) {

            int front = i + 1;
            int back = nums.length - 1;
            
            while(front < back) {
                int sum = nums[i] + nums[front] + nums[back];
                if(sum < 0) {
                    front++;
                }
                else if(sum > 0) {
                    back--;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[front], nums[back]));
                    front++;
                    back--;
                }
            }
        }

        return new ArrayList<>(res);
    }
}
