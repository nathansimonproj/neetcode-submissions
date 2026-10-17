class Solution {
    public int minCostClimbingStairs(int[] cost) {
        

        for(int i = cost.length - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i+1], cost[i+2]);
        }

        return Math.min(cost[0], cost[1]);
    }
}


/*

    at every point, the min cost
        curr cost + min(+1, + 2)
    
    minCost(-1)==cost(-1)
    minCost(-2)==cost(-2)

*/