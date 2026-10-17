class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] minCost = new int[cost.length];

        minCost[minCost.length - 1] = cost[cost.length - 1];
        minCost[minCost.length - 2] = cost[cost.length - 2];

        for(int i = cost.length - 3; i >= 0; i--) {

            minCost[i] = cost[i] + Math.min(minCost[i + 1], minCost[i + 2]);

        }

        return Math.min(minCost[0], minCost[1]);
    }


}


/*



    bottom up dp


        minCost last position = last position
        minCost second last position = second last position

        minCost[i] = cost[i] + min( minCost[i + 1], minCost[i + 2])

        return minCost[0];
*/