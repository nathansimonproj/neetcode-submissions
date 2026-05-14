class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        /*
            min rate=1 banana/hr
            max rate=max pile/hr


        */

        //solve max pile
        int max = -1;
        for(int pile: piles) {
            max = pile > max ? pile : max;
        }


        int l = 1;
        int r = max;

        int ans = 0;

        int rate = 0;

        while(l <= r) {
            rate = (l+r)/2;

            int hrs = 0;
            for(int pile : piles) {
                hrs += Math.ceilDiv(pile, rate);
            }
            if(hrs > h) {
                l = rate + 1;

            }
            else {
                r = rate - 1;
                ans = rate;
            }
        }

        return ans;

    }
}
