class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> seen = new HashMap<>();
        int difference = 0;

        for(int i = 0; i < numbers.length; i++) {
            difference = target - numbers[i];

            if(seen.keySet().contains(difference)) {
                return new int[]{seen.get(difference)+1, i+1};
            }

            seen.put(numbers[i], i);
        }

        return new int[2];

    }
}
