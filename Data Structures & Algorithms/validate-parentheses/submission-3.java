class Solution {
    public boolean isValid(String s) {
        

        Stack<Character> open = new Stack<>();

        char[] a = s.toCharArray();

        for(char c : a) {
            if(c == '(' || c == '[' || c == '{') {
                open.push(c);
            }
            else {

                if(open.isEmpty()) {
                    return false;
                }

                if(c == ')') {
                    if(open.peek() != '(') {
                        return false;
                    }
                }

                else if(c == ']') {
                    if(open.peek() != '[') {
                        return false;
                    }
                }

                else if(c == '}') {
                    if(open.peek() != '{') {
                        return false;
                    }
                }

                open.pop();
            }
        }

        return open.isEmpty();
    }
}
