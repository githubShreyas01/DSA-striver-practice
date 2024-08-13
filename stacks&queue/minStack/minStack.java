class MinStack {
    Stack< Long > st = new Stack<>();
    Long mini = Long.MAX_VALUE;
    
    public void push(int val) {
        Long val1 = Long.valueOf(val);
        if(st.isEmpty()){
            st.push(val1);
            mini = val1;
        }
        else{
            if(val1 > mini) st.push(val1);
            else{
                st.push(val1 - mini + val1);
                mini = val1;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return  ;
        Long x = st.peek();
        st.pop();
        if(x <  mini){
            mini = ((2*mini) - x);
        }    
    }
    
    public int top() {
        if(st.empty()) return Integer.MAX_VALUE;
        Long el = st.peek();
        if(el > mini){
           return el.intValue();
        }
        return mini.intValue();
    }
    
    public int getMin() {
        return mini.intValue();
    }
}
