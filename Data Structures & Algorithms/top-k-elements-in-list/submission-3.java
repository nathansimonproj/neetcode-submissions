class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        PriorityQueue<int[]> minHeap  = new PriorityQueue<>((a, b) -> a[1] - b[1]); //[num, freq]

        for(int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(int key : freqMap.keySet()) {
            minHeap.offer(new int[]{key, freqMap.get(key)});
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[0];
        }

        return res;

    }


    /*

        max heap< num, count >, need a custom comparator

        loop through array, add to heap

    */
}
