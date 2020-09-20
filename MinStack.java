class MinStack {
    private class Node {
        int val;
        int min;
        Node(int val) {
            this.val = val;
        }
    }
    
    List<Node> stack;
    int top;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        top = -1;
    }
    
    public void push(int x) {
        Node newNode = new Node(x);
        if(top == -1)
            newNode.min = x;
        else {
            int temp = stack.get(top).min;
            if(temp>x)
                newNode.min = x;
            else
                newNode.min = temp;
        }
        stack.add(newNode);
        top++;
    }
    
    public void pop() {
        stack.remove(top);
        top--;
    }
    
    public int top() {
        return stack.get(top).val;
    }
    
    public int getMin() {
        return stack.get(top).min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */