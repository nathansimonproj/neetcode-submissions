class KthLargest {

    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {

        this.pq = new PriorityQueue<Integer>();
        this.k = k;

        for(int i = 0; i < nums.length; i++) {

            if(i < k) {
                pq.offer(nums[i]);
            }
            else if (nums[i] > this.pq.peek()) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
    }
    
    public int add(int val) {

        if(pq.isEmpty()) {
            pq.offer(val);
        }

        else if(val > pq.peek()) {
            pq.offer(val);
        }

        if(pq.size() > k) {
            pq.poll();
        }

        return pq.peek();
    }
}
