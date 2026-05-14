class Solution {
    public boolean isAnagram(String s, String t) {


        //HashMap sol

        //short circuit
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {

            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            /*
                s++
                t--;
            */

            counts.put(sChar, counts.getOrDefault(sChar, 0) + 1);
            counts.put(tChar, counts.getOrDefault(tChar, 0) - 1);

        }

        for(int i : counts.values()) {
            if(i != 0) {
                return false;
            }
        }

        return true;
        
    }
}
