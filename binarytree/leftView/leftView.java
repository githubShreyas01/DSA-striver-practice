// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<>();
      leftV(root, res, 0);
      return res;
    }
    
    private void leftV(Node root, ArrayList<Integer> res, int level){
        if(root == null) return ;
        if(level == res.size()){
            res.add(root.data);
        }
        
        leftV(root.left, res, level+1);
        leftV(root.right, res, level+1);
    }
}
