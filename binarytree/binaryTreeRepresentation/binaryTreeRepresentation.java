// } Driver Code Ends


//User function Template for Java

class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        Node root = build(v, 0);
        root0.left = root.left;
        root0.right = root.right;
    }
    
    public static Node build(ArrayList<Integer> v, int ind){
        if(ind >= v.size() ){
            return null;
        }
        
        Node root = new Node(v.get(ind));
        
        root.left = build(v, 2*ind +1); // odd index
        root.right = build(v, 2*ind + 2);  // even index
        
        return root;
    }
}
