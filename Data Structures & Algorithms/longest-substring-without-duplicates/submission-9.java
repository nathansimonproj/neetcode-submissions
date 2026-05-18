class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        Map<Character, Integer> idx = new HashMap<>();

        int l = 0;
        int r = 0;

        int max = 0;

        while(r < s.length()) {

            /*
                if char at r not seen before, increment curr, check math.max

                if seen before, update l, dont go backwards
            */

            if(idx.keySet().contains(s.charAt(r))) {
                l = Math.max(idx.get(s.charAt(r)) + 1, l);
            }

            idx.put(s.charAt(r), r);
            max = Math.max(max, r - l + 1);
            r++;

        }

        return max;
    }
}
