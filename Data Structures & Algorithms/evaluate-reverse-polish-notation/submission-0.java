class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> nums = new Stack<>();

        for(String token : tokens) {
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) //number
            {
                nums.push(Integer.parseInt(token));
            }
            else {
                int a = nums.pop();
                int b = nums.pop();
                if(token.equals("+")) {
                    nums.push(a + b);
                }
                else if(token.equals("-")) {
                    nums.push(b - a);
                }
                else if(token.equals("*")) {
                    nums.push(a * b);
                }
                else {
                    nums.push(b / a);
                }
            }
        }

        return nums.pop();
    }
}
