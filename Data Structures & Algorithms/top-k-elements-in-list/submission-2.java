class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //result array of length k
        int[] res = new int[k];
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        //create frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        //STATE: have a map of number to freqeuncy
        // next steps: extract the k highest freq

        for(int i : freqMap.keySet()) {
            int freq = freqMap.get(i);
            buckets[freq].add(i);
        }

        /*
            loop backwards
            add until k filled
        */
        for(int i = buckets.length - 1; k > 0 && i >= 0; i--) {
            if(buckets[i].isEmpty()) {
                continue;
            }

            for(int j = 0; j < buckets[i].size() && k > 0; j++) {
                res[k-1] = buckets[i].get(j);
                k--;
            }

        }

        return res;
    }
}
