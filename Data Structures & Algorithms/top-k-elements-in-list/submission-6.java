class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1); // {num,freq}
        }

        for(Map.Entry<Integer, Integer> num : freq.entrySet()) {
            maxHeap.offer(new int[] {num.getKey(), num.getValue()}); //{num, freq}
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = maxHeap.poll()[0];
        }

        return res;
    }
}
