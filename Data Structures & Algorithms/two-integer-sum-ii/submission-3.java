class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length - 1;

        while(l < r) {
            int total = numbers[l] + numbers[r];

            //binary search kinda idea
            if(total == target) {
                return new int[] {l+1, r+1};
            }
            else if(total < target) {
                l++;
            }
            else {
                r--;
            }
        }

        return new int[2];
    }
}
