class Solution {
    public String reverseWords(String s) {
        String[] res = s.trim().split("\\s+");
        String out = "";

        for(int i=res.length - 1; i>0;i--){
            out += res[i] + " ";
        }
        return out + res[0];
    }
}
