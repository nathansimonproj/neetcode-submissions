class Solution {
    public int lastStoneWeight(int[] stones) {
        //add everything to a heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones) {
            maxHeap.offer(s);
        }

        while(maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if(x == y) {
                continue;
            }
            if(x != y) {
                maxHeap.offer(x-y);
            }
        }

        if(maxHeap.size() == 1) {
            return maxHeap.poll();
        }

        return 0;
    }
}
