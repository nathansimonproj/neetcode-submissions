class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        

        Stack<int[]> temps = new Stack<>();
        int[] ans = new int[temperatures.length];

        for(int i = temperatures.length - 1; i >= 0; i--) {

            int days;

            while(!temps.isEmpty() && temps.peek()[0] <= temperatures[i]) {
                temps.pop();
            }
            if(temps.isEmpty()) {
                days = 0;
            }
            else {
                days = temps.peek()[1] - i;
            }

            temps.push(new int[] {temperatures[i], i});
            ans[i] = days;
        }

        return ans;
    }
}
