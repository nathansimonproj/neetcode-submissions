class Solution {
    public int maxProfit(int[] prices) {
        
        int low = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < low) {
                low = prices[i];
            }
            else {
                int curr = prices[i] - low;
                max = Math.max(max, curr);
            }
        }

        return max;
    }
}
