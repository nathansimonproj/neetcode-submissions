class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*

            reduce each string into its character frequency

            map<freq, list of strs>

        */
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs) {

            //turn into freqeuncy
            int[] freq = new int[26];
            for(int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(freq);
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);

        }

        return new ArrayList<>(mp.values());
    }
}
