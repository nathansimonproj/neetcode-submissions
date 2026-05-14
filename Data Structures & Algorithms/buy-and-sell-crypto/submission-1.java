class Solution {
    public int maxProfit(int[] prices) {
        
        int maxP = 0;

        int left = 0;
        int right = 1;

        while(right < prices.length) {
            if(prices[right] < prices[left]) {
                left = right;
            }
            else {
               maxP = Math.max(maxP, prices[right] - prices[left]); 
            }
            
            right++;
        }

        return maxP;
       
    }
}
