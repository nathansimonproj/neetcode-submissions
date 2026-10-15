class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        

        int[] rans = new int[26];

        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            rans[c - 'a']++;
        }

        for(int i = 0; i < magazine.length(); i++) {
            
            char c = magazine.charAt(i);
            rans[c - 'a']--;
        }

        for(int i : rans) {
            if(i > 0) {
                return false;
            }
        }

        return true;
    }
}