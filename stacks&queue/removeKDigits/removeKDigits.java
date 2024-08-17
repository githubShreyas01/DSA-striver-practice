class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        int n = num.length();
      
        for(int i=0;i<n;i++){
            while(!st.isEmpty() &&  k>0 && (st.peek() > (num.charAt(i) - '0'))){            //if num in stack > num(i) remove elem from stack
                st.pop();
                k--;
            }
            st.push(num.charAt(i)-'0');
        }

        while(k>0) {                                                                     // no digit removed from stack therefore removing them till k>0     
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";                                                    // if not elem pushed in stack return zero as string

        StringBuilder res =new StringBuilder();
        while(!st.isEmpty()){                                                          // pop elem from stack 
            res.append(st.pop());
        }
        res.reverse();                                                                // reverse the popped elems string

        while (res.length() > 0 && res.charAt(0) == '0') {                            // deleting preeceding zeroes
            res.deleteCharAt(0);
        }
        
        return res.length() > 0 ? res.toString() : "0";                              // converting int to string is length is > 0 
   
    }
}
