class Solution {

    Map<Integer, Integer> seen = new HashMap<>();

    public int climbStairs(int n) {
        return rec(n);
    }

    private int rec(int n) {

        if(seen.containsKey(n)) {
            return seen.get(n);
        }

        if(n == 0) {
            return 1;
        }

        if(n < 0) {
            return 0;
        }

        int total = rec(n - 1) + rec(n - 2);
        seen.put(n, total);
        return total;
    }
}


/*

    at each stage, either 1 or 2

    base case
        reach end
            + 1
        go past
            + 0

*/
