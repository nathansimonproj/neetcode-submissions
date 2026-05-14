class MinStack {

    /*
        current stack and stack of minimum values --> each thing essentially points to each other
        stack of minimum values
    */

    private Stack<Integer> genStack;
    private Stack<Integer> minimums;

    public MinStack() {
        this.genStack = new Stack<>();
        this.minimums = new Stack<>();
    }
    
    public void push(int val) {
        
        /*
            3 cases
                a. empty stack --> push to both
                b. non empty stack + non min --> push to genStack
                c. non empty stack + min --> push to both
        */


        if(this.genStack.isEmpty() || (!this.genStack.isEmpty() && val <= minimums.peek())) {
            this.minimums.push(val);
        }
        this.genStack.push(val); 


    }
    
    public void pop() {
        /*
            2 cases
                a. non minimum --> pop from genstack
                b. minimum --> pop from both
        */
        int pop = this.genStack.pop();
        if(pop == this.minimums.peek()) {
            this.minimums.pop();
        }
    }
    
    public int top() {
        return this.genStack.peek();
    }
    
    public int getMin() {
        return this.minimums.peek();
    }
}
