class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(int i = 0; i < s.length(); i++) {

            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);

            sArr[sCurr - 'a']++;
            tArr[tCurr - 'a']++;
        }

        for(int i = 0; i < sArr.length; i++) {
            if(sArr[i] != tArr[i]) {
                return false;
            }
        }

        return true;
        
    }
}
