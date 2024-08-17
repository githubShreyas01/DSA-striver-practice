public class Solution {
    public int[] prevSmaller(int[] A) {
        int n = A.length;
        int [] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i =0 ;i<n;i++){
            while(!st.isEmpty() && st.peek() >= A[i]) st.pop();
            
            nse[i] = st.isEmpty() ? -1 : st.peek();
            
            st.push(A[i]);
        }
        
        return nse;
    }
}
