// } Driver Code Ends


class Solution {
    // Function to find priority of operands.
    public static int priority(char c){
        char ch =c;
        if(ch == '^') return 3;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '+' || ch == '-') return 1;
        else return -1;
    }

  // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        int i =0;
        String ans = "";
        Stack<Character> st = new Stack<>();
        int n = exp.length();
        while(i<n){
            char c = exp.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                ans = ans + c;
            }
            
            else if(c == '('){
                st.push(c);
            }
            
            else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans = ans + st.pop();
                }
                st.pop(); // pops ( ) pair
            }
            
            else{
                while(!st.isEmpty() && priority(c) <= priority(st.peek())){
                    ans = ans + st.pop();
                }
                st.push(c);
            }
            i++;
        }
        
        while(!st.isEmpty()){
            ans = ans +  st.pop();
        }
        return ans;
    }
}
