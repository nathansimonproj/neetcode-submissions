class KthLargest {

    private PriorityQueue<Integer> stream;
    private int k;

    public KthLargest(int k, int[] nums) {
        
        this.k = k;
        this.stream = new PriorityQueue<Integer>();

        for(int i : nums) {
            stream.offer(i);
            if(stream.size() > k) {
                stream.poll();
            }
        }
    }
    
    public int add(int val) {
        
        stream.offer(val);
        if(stream.size() > k) {
            stream.poll();
        }

        return stream.peek();
    }
}
