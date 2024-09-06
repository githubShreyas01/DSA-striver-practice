// } Driver Code Ends

// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        int i = 0;
        int n =post_exp.length();
        Stack<String> st = new Stack<>();
        
        while(i<n){
            char c = post_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c +"");
            }
            else{
                String s1 = st.pop();
                String s2 = st.pop();
                
                st.push(c + s2 + s1);
            }
            i++;
        }
        return st.peek();
    }
}
