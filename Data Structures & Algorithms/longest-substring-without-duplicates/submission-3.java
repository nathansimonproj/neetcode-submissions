class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        //Brute Force solution
        /*

            start at each char and extend out as long as repeat not seen, return max

        */

        Set<Character> seen = new HashSet<>();
        int curr = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++) {
            int j = i;
            while(j < s.length() && !seen.contains(s.charAt(j))) {
                seen.add(s.charAt(j));
                curr++;
                j++;
            }

            if(curr > max) {
                max = curr;
            }

            seen.clear();
            curr = 0;
        }

        return max;
    }
}
