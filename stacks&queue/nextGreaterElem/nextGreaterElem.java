// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] nge = new long[n];
        Stack<Long> st = new Stack<>();
        
        for(int i=n-1 ; i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return nge;
    } 
}
