class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal); // doubles the string and checks for goal that whether it matches string s with rotation format
    }
}
