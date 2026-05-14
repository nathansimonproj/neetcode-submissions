class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int front = 0;
        int back = numbers.length - 1;

        while(front < back) {
            int total = numbers[front] + numbers[back];
            if(total == target) {
                return new int[] {front + 1, back + 1};
            }
            if(total < target) {
                front++;
            }
            else {
                back--;
            }
        }

        return new int[1];
    }
}
