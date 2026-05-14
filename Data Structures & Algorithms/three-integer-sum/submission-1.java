class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> triples = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {

            int lo = i + 1;
            int hi = nums.length - 1;

            while(lo < hi) {
                int total = nums[i] + nums[lo] + nums[hi];

                if(total == 0) {
                    List<Integer> validTriple = new ArrayList<>(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    triples.add(validTriple);
                    lo++;
                    hi--;
                }
                else if(total < 0) {
                    lo++;
                }
                else {
                    hi--;
                }
            }
        }

        return new ArrayList<>(triples);
    }
}
