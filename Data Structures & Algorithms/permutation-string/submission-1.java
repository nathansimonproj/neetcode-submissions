class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        /*
            maintain a map of freq of s1


            sliding window, decrement from freq of s1
            
            slide window
                re increment l of s1
                increment r of s2
        */

        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;

        while(r < s2.length()) {

            if(freq.keySet().contains(s2.charAt(r))) {
                freq.put(s2.charAt(r), freq.get(s2.charAt(r)) - 1);
            }

            if(r - l + 1 == s1.length()) {

                int rem = 0;
                boolean valid = true;
                for(int i : freq.values()) {
                    if(i != 0) {
                        valid = false;
                        break;
                    }
                }

                if(valid) {
                    return true;
                }

                if(freq.keySet().contains(s2.charAt(l))) {
                    freq.put(s2.charAt(l), freq.get(s2.charAt(l)) + 1);
                }
                l++;
            }

            r++;
        }

        return false;
    }

}
