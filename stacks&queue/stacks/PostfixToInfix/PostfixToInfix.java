// } Driver Code Ends

// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        int i = 0;
        int n = exp.length();
        Stack<String> st = new Stack<>();
        
        while(i<n){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c + "");
            }
            else{
                String s1 = st.pop();
                String s2 = st.pop();
                
                String str = "(" + s2 + c + s1 + ")";
                st.push(str);
            }
            i++;
        }
        return st.peek();
    }
}
