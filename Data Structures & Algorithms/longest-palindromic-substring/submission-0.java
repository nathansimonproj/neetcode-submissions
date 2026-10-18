class Solution {

    public String longestPalindrome(String s) {
        
        String max = "";
        StringBuilder sb = new StringBuilder();

        int l = 0;
        int r = 0;

        for(int i = 0; i < s.length(); i++) {
            
            sb.setLength(0);
            l = i - 1;
            r = i + 1; 

            sb.append(s.charAt(i));

            //odd
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                sb.insert(0, s.charAt(l));
                sb.append(s.charAt(r));
                l--;
                r++;
            }

            if(sb.length() > max.length()) {
                max = sb.toString();
            }

            //even
            sb.setLength(0);
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                sb.insert(0, s.charAt(l));
                sb.append(s.charAt(r));
                l--;
                r++;
            }

            if(sb.length() > max.length()) {
                max = sb.toString();
            }

        }

        return max;
    }

}


/*

    palindrome



*/