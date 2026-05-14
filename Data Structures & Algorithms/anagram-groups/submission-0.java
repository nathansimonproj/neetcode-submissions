class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> sol = new ArrayList<>();
        Map<String, Integer> indexMap = new HashMap<>();

        int currIndex = 0;

        for(String word : strs) {

            //turn into anagram
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            if(indexMap.keySet().contains(sortedWord)) {

                sol.get(indexMap.get(sortedWord)).add(word);

            }

            //case 2: anagram not present so far
            else{
                
                indexMap.put(sortedWord, currIndex);
                currIndex += 1;
                
                List<String> l = new ArrayList<>();
                l.add(word);
                sol.add(l);


            }
        }

        return sol;
    }
}
