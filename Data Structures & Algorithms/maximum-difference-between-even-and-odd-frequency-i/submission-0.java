class Solution {
    public int maxDifference(String s) {
        
        int[] freq = new int[26];

        int oddMax = 0;
        int evenMin = 100000;
        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        for(int i : freq) {
            if(i % 2 == 1 && i > oddMax) {
                oddMax = i;
            }
        }

        int res = 0;

        for(int i : freq) {
            if(i % 2 == 0 && i != 0 && i < evenMin) {
                evenMin = i;
            }
        }
        

        return oddMax - evenMin;
    }
}

/*



*/