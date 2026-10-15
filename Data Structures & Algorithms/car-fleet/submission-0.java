class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        

        List<double[]> pairs = new ArrayList<>();

        for(int i = 0; i < position.length; i++) {

            double pos = position[i];
            double sp = speed[i];

            pairs.add(new double[] {pos, sp});
        }

        pairs.sort(Comparator.comparingDouble((double[] arr) -> arr[0]).reversed());

        Stack<Double> s = new Stack<>();
        for(double pair[] : pairs) {

            double t = (target - pair[0]) / pair[1];

            if(!s.isEmpty() && t <= s.peek()) {
                continue;
            }
            s.push(t);
        }

        return s.size();

    }
}


/*

    throw everything into a stack in sorted order by position, pop first 2 out, if 2nd car reaches at same time

*/

