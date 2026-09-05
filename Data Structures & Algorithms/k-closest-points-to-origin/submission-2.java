class Solution {
    public int[][] kClosest(int[][] points, int k) {

        //maxHeap
        //PriorityQueue<Map.Entry<Double, int[]>> pq = new PriorityQueue<>((a,b) -> Double.compare(b.getKey(), a.getKey()));

        // PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> 
        //     Double.compare(Math.sqrt(Math.pow(b[0], 2) + Math.pow(b[1], 2)), Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2)))
        // );
        
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> 
            (b[0] * b[0] + b[1] * b[1]) - 
            (a[0] * a[0] + a[1] * a[1]) 
        );

        
        for(int[] pt : points) {

            pq.offer(pt);
            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++) {
            int[] top = pq.poll();
            res[i][0] = top[0];
            res[i][1] = top[1];
        }

        return res;

    }
}


/*

    priority queue custom comparator is the Euclidean distance between each point

    1. Initialize PQ with Euclidean distance. Values are just the points themselves.
    2. Loop through. Whenever queue size exceeds K, pull.
    3. Loop K times. Add to array.
*/