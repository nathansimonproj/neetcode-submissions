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


        int front = 0;
        int back = s.length() - 1;

        while(front < back) {

            //advance each to alphanumeric
            while(!Character.isLetterOrDigit(s.charAt(front)) && front < back) {
                front++;
            }
            while(!Character.isLetterOrDigit(s.charAt(back)) && front < back) {
                back--;
            }

            if(Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }
}
