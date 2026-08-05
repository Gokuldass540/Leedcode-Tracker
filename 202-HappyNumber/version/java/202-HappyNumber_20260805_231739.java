// Last updated: 8/5/2026, 11:17:39 PM
1class MyStack {
2    // We use ArrayDeque but restrict ourselves to standard Queue operations
3    ArrayDeque<Integer> q1;
4    int size;
5
6    public MyStack() {
7        q1 = new ArrayDeque<>();
8        size = 0;
9    }
10    
11    public void push(int x) {
12        q1.offerLast(x);
13        size++;
14    }
15    
16    public int pop() {
17        // Rotate the first (size - 1) elements to the back of the queue
18        for(int i = 0; i < size - 1; i++) {
19            int first = q1.pollFirst();
20            q1.offerLast(first);
21        }
22
23        size--;
24        // The element we actually want to pop is now sitting at the front!
25        return q1.pollFirst();
26    }
27    
28    public int top() {
29        int top = 0;
30        // Rotate all elements to maintain the queue's original state,
31        // saving the value of the last element we see.
32        for(int i = 0; i < size; i++) {
33            top = q1.pollFirst();
34            q1.offerLast(top);
35        }
36
37        return top;
38    }
39    
40    public boolean empty() {
41       // Clean, direct boolean evaluation
42       return size == 0;
43    }
44}
45
46/**
47 * Your MyStack object will be instantiated and called as such:
48 * MyStack obj = new MyStack();
49 * obj.push(x);
50 * int param_2 = obj.pop();
51 * int param_3 = obj.top();
52 * boolean param_4 = obj.empty();
53 */