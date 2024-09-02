class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())  return false;
        HashMap<Character, Character> hmpp = new HashMap<Character, Character>();

        for(int i = 0;i<s.length();i++){
            if(hmpp.containsKey(s.charAt(i))){
                if(hmpp.get(s.charAt(i)) != (t.charAt(i))){
                    return false;
                }
            }
            else if(hmpp.containsValue(t.charAt(i))){
                return false;
            }
            hmpp.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}
