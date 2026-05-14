class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //create buckets for each thing
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        Map<Integer, Integer> counts = new HashMap<>();

        for(int i : nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        //STATE: have a map of numbers to their counts
        //need the top two

        for(int i : counts.keySet()) {
            buckets[counts.get(i)].add(i);
        }

        //STATE: have an array of buckets with numbers for each freqeuency
        int[] res = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if(buckets[i].isEmpty()) {
                continue;
            }
            for(int num : buckets[i]) {

                if(index < k) {
                    res[index] = num;
                    index++;
                }
            }
        }

        return res;
    }
}
