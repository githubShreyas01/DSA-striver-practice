// } Driver Code Ends


//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(isSum(root) == true) return 1;
        return 0;
    }
    
    public static boolean isSum(Node root){
        if(root == null || root.left == null && root.right == null) return true;
        
        boolean left = isSum(root.left);
        boolean right = isSum(root.right);
        
        if(root.left == null && root.right.data != root.data) return false;
        if(root.right == null && root.left.data != root.data) return false;
        
        if((root.left != null && root.right != null) && (root.left.data + root.right.data != root.data)) return false;
        
        return left && right;   
    }
}
