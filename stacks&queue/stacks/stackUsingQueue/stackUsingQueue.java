class MyStack {
    Queue<Integer> qu = new LinkedList<>();

    public void push(int x) {
        qu.add(x);
        for (int i = 1; i < qu.size(); i++) qu.add(qu.poll());
    }
    
    public int pop() {
        return qu.poll();
    }
    
    public int top() {
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.isEmpty();
    }
}
