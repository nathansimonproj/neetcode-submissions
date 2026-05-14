class Solution {
    public boolean isPalindrome(String s) {
        /*

            read the same forward and backwards

            case insensitive
            ignores non-alphanumeric char


            front and back ptr
                skip to each alphanumeric char
                check equals

        */

        String t = s.toLowerCase();

        int front = 0;
        int back = s.length() - 1;

        while(front < back) {

            //advance each to alphanumeric
            while(!Character.isLetterOrDigit(t.charAt(front)) && front < back) {
                front++;
            }
            while(!Character.isLetterOrDigit(t.charAt(back)) && front < back) {
                back--;
            }

            if(t.charAt(front) != t.charAt(back)) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }
}
