// } Driver Code Ends


// User function Template for Java

class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int ceil = -1;
        while(root != null){
            if(key == root.data){
                ceil = root.data;
                return ceil;
            }
            if(key < root.data){
                ceil = root.data;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        
        return ceil;
    }
}
