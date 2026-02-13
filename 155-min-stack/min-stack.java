class MinStack {

    Stack<Integer> smin;
    Stack<Integer> snormal;

    public MinStack() {
         smin=new Stack<>();
         snormal=new Stack<>();
    }
    
    public void push(int val) {
        snormal.push(val);
        if(smin.isEmpty() || smin.peek()>=val){
            smin.push(val);
        }
    }
    
    public void pop() {
    
        int removed = snormal.pop();

        if (removed == smin.peek()) {
            smin.pop();
        }
    }
    
    public int top() {
        return snormal.peek();
    }
    
    public int getMin() {
        return smin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */