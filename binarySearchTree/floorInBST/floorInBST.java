// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int floor = -1;
        if(root == null) return -1;
        while(root != null){
            if(x == root.data){
                floor = root.data;
                return floor;
            }
            if(x > root.data){
                floor = root.data;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return floor;
    }
}
