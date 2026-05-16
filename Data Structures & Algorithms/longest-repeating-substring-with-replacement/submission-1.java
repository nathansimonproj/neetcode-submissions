class Solution {
    public int characterReplacement(String s, int k) {
        

        /*
            keep an array of the character to their frequencies in the given subset

            if(windowLength - maxFreq > k) {
                move left ptr up
                update left ptr char frequency
            }
        */

        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;

        int ans = 0;
        for(int r = 0; r < s.length(); r++) {

            //check whether windowSize - maxChar > k
                //shift left over, update freq, update maxFreq?
                //when hit max, check whether window size > curr ans
            int currWindow = r - l + 1;
            
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(freq[s.charAt(r) - 'A'], maxFreq);

            if(currWindow - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
                currWindow = r - l + 1;

            }

            ans = Math.max(ans, currWindow);
            
        }

        return ans;
    }
}
