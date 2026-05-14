class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //initialize 2 pointers, one for back and one for front

        //if too big, decrement front pointer

        //if too small, increment back pointer

        int front = 0;
        int back = numbers.length - 1;

        while(front < back) {
            int curr = numbers[front] + numbers[back];

            if(curr == target) {
                return new int[] {front+1, back+1};
            }

            else if(curr < target) {
                front++;
            }

            else if(curr > target) {
                back--;
            }
        }
        
        return new int[1];
    }
}
