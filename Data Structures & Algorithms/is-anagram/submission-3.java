class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray(); //creating a char arry for t

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }


    /*

        cat --> [c, a, t]

        act --> [a, c, t]

    */
}
