class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String word : strs) {
            sb.append(word.length()).append("#").append(word);
        }

        return sb.toString();
        //length + delimeter + word

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

       // 4#neet4#code4#love3#you

       int i = 0;
       int delimPtr = 0;

       while(i < str.length()) {
        while(str.charAt(delimPtr) != '#') {
            delimPtr++;
        }

        //delimPtr == "#"
        int length = Integer.parseInt(str.substring(i, delimPtr));
        result.add(str.substring(delimPtr + 1, delimPtr + 1 + length));

        i = delimPtr + 1 + length;
        delimPtr = i;

       }

       return result;
    }
}
