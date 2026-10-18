class Solution {
    public String longestPalindrome(String s) {
        
        int max = 0;

        int resL = 0;
        int resR = 0;

        int l = 0;
        int r = 0;
        for(int i = 0; i < s.length(); i++) {

            //odd
            l = i - 1;
            r = i + 1;

            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                if(r - l + 1 > max) {
                    max = r - l + 1;
                    resL = l;
                    resR = r;
                }

                l--;
                r++;
            }

            

            //even
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                if(r - l + 1 > max) {
                    max = r - l + 1;
                    resL = l;
                    resR = r;
                }

                l--;
                r++;
            }
        }

        return s.substring(resL, resR + 1);
    }
}


/*

    expand around center, keep track of l, r ptrs and, length

    if(r - l + 1 > len) {
        reassign
    }

*/