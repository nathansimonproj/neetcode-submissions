class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for(int i = 0; i < s.length(); i++) {

            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);

            counts[sCurr - 'a']++;
            counts[tCurr - 'a']--;
        }

        for(int i : counts) {
            if(i != 0) {
                return false;
            }
        }

        return true;
        
    }
}
