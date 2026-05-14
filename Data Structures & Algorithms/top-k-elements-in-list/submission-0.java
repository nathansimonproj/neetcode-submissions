class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*

            loop through every element --> add to frequency map --> add to numbers to buckets --> loop backwards through buckets

        */
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] counts = new List[nums.length + 1];
        for(int n : freqMap.keySet()) {
            int freq = freqMap.get(n);
            if(counts[freq] == null) {
                counts[freq] = new ArrayList<>();
            }
            counts[freq].add(n);
        }

        //loop backwards through list
        int[] res = new int[k];
        int counter = 0;
        for(int i = counts.length - 1; i >= 0 && counter < k; i--) {
            if(counts[i] != null) {
                for(int n : counts[i]) {
                    res[counter] = n;
                    counter++;
                }
            }
        }

        return res;
    }
}
