// } Driver Code Ends

// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        int n = pre_exp.length();
        int i = n-1;
        Stack<String> st = new Stack<>();
        
        while(i>=0){
            char c = pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c +"");
            }
            else{
                String s1 = st.pop();
                String s2 = st.pop();
                
                String str = "(" + s1 + c + s2 + ")";
                st.push(str);
            }
            i--;
        }
        return st.peek();
    }
}
