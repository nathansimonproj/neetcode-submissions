class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>( (a,b) -> Integer.compare(dist(b), dist(a)));

        for(int[] pt : points) {
            maxHeap.offer(pt);

            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];
        int c = 0;
        while(!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            res[c][0] = curr[0];
            res[c][1] = curr[1];

            c++;
        }

        return res;
    }

    private int dist(int[] pt) {
        return pt[0] * pt[0] + pt[1] * pt[1];
    }
}
