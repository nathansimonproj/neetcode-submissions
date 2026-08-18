class NumArray {

    private int[] nums;
    private int[] total;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.total = new int[nums.length + 1];

        int sum = 0;
        total[0] = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            this.total[i + 1] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        return total[right + 1] - total[left];
    }
}



/**

total - total before it

[-2, 0, 3, -5, 2, -1]

[0, -2, -2, 1, -5, 2, -1]

[0, 2] --> 1


 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */