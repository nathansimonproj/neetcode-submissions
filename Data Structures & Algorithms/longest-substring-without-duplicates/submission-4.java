class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*

            optimal solution

            left and right pointers

            iterate through each right pointer
                if set contains character at right pointer, remove from left of window until no right pointer, add char at r, 



        */

        int left = 0;
        int curr = 0;

        Set<Character> seen = new HashSet<>();

        for(int right = 0; right < s.length(); right++) {
            while(seen.contains(s.charAt(right))) {
                //previously seen value, shrink from left until no longer seen
                seen.remove(s.charAt(left));
                left++;
            }

            //new non seen value
            seen.add(s.charAt(right));
            curr = Math.max(curr, right - left + 1);
        }

        return curr;
    }


}
