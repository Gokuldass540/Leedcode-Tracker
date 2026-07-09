// Last updated: 7/9/2026, 3:08:40 PM
class MinStack {
    public Stack<Integer>Stack;
    public Stack<Integer>mini;

    public MinStack() {
        Stack= new Stack();
        mini= new Stack();
    }
    
    public void push(int val) {
         
            Stack.push(val);
            if(mini.size()>0){
                val=Math.min(mini.peek(),val);
            }
            mini.push(val);
        }
    
    
    public void pop() {
        Stack.pop();
        mini.pop();
        
    }
    
    public int top() {
        return Stack.peek();

    }
    
    public int getMin() {
        return mini.peek();
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