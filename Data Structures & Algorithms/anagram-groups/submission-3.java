class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> sorted = new HashMap<>();

        for(String s: strs) {
            //sort
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);

            sorted.putIfAbsent(sortedString, new ArrayList<String>());
            sorted.get(sortedString).add(s);
        }

        return new ArrayList<>(sorted.values());

    }
}
