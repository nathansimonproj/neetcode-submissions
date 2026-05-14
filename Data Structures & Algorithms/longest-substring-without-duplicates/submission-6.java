class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        /*
            longest substring w/o duplicates

                zxyzxyz

            hash set stores characters of current sequence
        */

        //brute force
        Set<Character> set = new HashSet<>();
        int max = 0;


        for(int i = 0; i < s.length(); i++) {
        
            int curr = 0;
            while(i + curr < s.length() && !set.contains(s.charAt(i + curr))) {

                set.add(s.charAt(i + curr));
                curr++;

            }

            max = Math.max(max, curr);
            set.clear();

        }

        return max;
    }
}
