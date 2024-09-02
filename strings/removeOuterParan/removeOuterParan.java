class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                if(cnt != 0){
                    ans.append(c);
                }
                cnt++;
            }
            else{
                if(cnt>1){
                    ans.append(c);
                }
                cnt--;
            }
        }
        return ans.toString();
    }
}
