// } Driver Code Ends


//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<Node> st = new Stack<>();
        
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            res.add(root.data);
            
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
            
        }
        
    return res;
    }

}
