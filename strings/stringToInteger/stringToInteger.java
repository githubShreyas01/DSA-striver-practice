class Solution {
    public int myAtoi(String s) {
        int n = s.length();

        if(n == 0) return 0;

        long res = 0;
        int i = 0;
        boolean isNeg = false;

        while(i<n && s.charAt(i) == ' ')
            i++;

        if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+') ){ 
            isNeg = (s.charAt(i) == '-');
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
                res = res*10 + (s.charAt(i) - '0');
                if(isNeg){
                    if(-res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                }
                else {
                    if(res>Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                    }
                }
                i++;
        }
        
        if(isNeg){
            res = -res;
        }
        return (int) res;
    }
}
