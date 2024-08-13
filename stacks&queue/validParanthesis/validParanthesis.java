class Solution {
    public boolean isValid(String s) {
        Stack<Character> charSt = new Stack<>();
        for(int i  =0 ; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                charSt.push(s.charAt(i));
            }
            else{
                if(charSt.isEmpty()) return false;
                char ch = charSt.peek();
                charSt.pop();
                if(s.charAt(i) == ')' && ch != '(' || s.charAt(i) == ']' && ch != '[' || s.charAt(i) == '}' && ch != '{' ){
                    return false;
                }
               
            }
        }
        return charSt.isEmpty();
    }
}
