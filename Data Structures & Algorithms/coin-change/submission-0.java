class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++) {
            dp[i] = amount + 1;
        }

        for(int i = 0; i < dp.length; i++) {
            for(int coin : coins) {
                
                if(coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
                
            }
        }

        return dp[dp.length - 1] != amount + 1 ? dp[dp.length - 1] : -1;

    }
}

/*

    how much does it take from here


*/
