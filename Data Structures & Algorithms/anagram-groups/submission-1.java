class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //hashmap
        Map<String, List<String>> sol = new HashMap<>(); 

        //loop
        for(String word : strs) {

            //conv to sortedString
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            //putifabsent
            sol.putIfAbsent(sortedWord, new ArrayList<String>());
            sol.get(sortedWord).add(word);


            //add
        }

        return new ArrayList<>(sol.values());

        //conv back

    }
}
