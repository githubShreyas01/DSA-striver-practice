class Pair{
    int price;
    int ind;
    Pair(int price, int ind) {
        this.price = price;
        this.ind = ind;
    }
}
class StockSpanner {
    private Stack<Pair> st;

    int ind = -1;
    public StockSpanner() {
        st = new Stack<>();
        ind = -1;
    }
    
    public int next(int price) {
        ind = ind + 1;
        while(!st.isEmpty() && st.peek().price <= price){
            st.pop();
        }

        int ans = ind - (st.isEmpty() ? -1 : st.peek().ind);
        st.push(new Pair(price, ind));

        return ans;
    }
}
