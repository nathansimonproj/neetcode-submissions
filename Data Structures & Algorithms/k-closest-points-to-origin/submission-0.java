class Solution {
    public int[][] kClosest(int[][] points, int k) {

        //maxHeap
        PriorityQueue<Map.Entry<Double, int[]>> pq = new PriorityQueue<>((a,b) -> Double.compare(b.getKey(), a.getKey()));

        for(int[] pt : points) {

            double dist = Math.sqrt(
                Math.pow(pt[0], 2) + Math.pow(pt[1], 2)
            );

            
            pq.offer(Map.entry(dist, pt));
            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++) {
            int[] top = pq.poll().getValue();
            res[i][0] = top[0];
            res[i][1] = top[1];
        }

        return res;

    }
}


/*

    create distance map < distance , point[] >

    iterate through distance map, add to pq w comparator on distance

        when more than k, pop

    iterate through pq, add map.entry.getValue() to res

*/