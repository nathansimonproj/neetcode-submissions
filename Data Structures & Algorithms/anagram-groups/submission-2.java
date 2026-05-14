class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        /*
            two parts
                determining anagrams

                grouping anagrams into lists


            for each word
                turn it into its normalized anagram version
                keep a running list of seen normalized anagrams
                add if seen, create if new

            HashMap
        */

        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s : strs) {
            //turn it into some normal version --> sorting it
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sortedString = new String(sArr);

            //STATE: have a sorted string
            if(!anagrams.keySet().contains(sortedString)) {
                anagrams.put(sortedString, new ArrayList<>());
            }

            anagrams.get(sortedString).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
