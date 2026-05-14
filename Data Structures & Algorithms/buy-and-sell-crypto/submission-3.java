class Solution {
    public int maxProfit(int[] prices) {
        /*

            initialize two pointers
                
            
            if next < prev, then we want to buy on that day, bump both pointers up, if next > prev, check max and iterate up, keep track of global min
        */

        int l = 0;
        int r = 1;

        int max = 0;

        while(r < prices.length) {
            
            //case a: prices[r] < prices[l] --> bump both ptrs up

            //case b: prices[r] >= prices[l] --> check max, keep iterating

            if(prices[r] < prices[l]) {
                l = r;
                r++;
            }
            else {
                max = Math.max(max, prices[r] - prices[l]);
                r++;
            }
        }

        return max;


    
    }
}
