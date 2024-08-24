// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> res = new ArrayList<>();
	    if(node == null) return res;
	    
	    if(isLeaf(node) == false) res.add(node.data);
	    
	    addLeftBoundary(node, res);
	    addLeaves(node, res);
	    addRightBoundary(node, res);
	    
	    return res;
	}
	
	void addLeftBoundary(Node node, ArrayList<Integer> res){
	    Node curr = node.left;
	    while(curr != null){
	        if(isLeaf(curr) == false) res.add(curr.data);
	        if(curr.left != null) curr = curr.left;
	        else curr = curr.right;
	    }
	}
	
	void addLeaves(Node node, ArrayList<Integer> res){
	    if(isLeaf(node)==true){
	        res.add(node.data);
	        return;
	    }
	    
	    if(node.left != null) addLeaves(node.left, res);
	    if(node.right != null) addLeaves(node.right, res);
	}
	
	void addRightBoundary(Node node, ArrayList<Integer> res){
	    Node curr = node.right;
	    Stack<Integer> temp = new Stack<>();
	    while(curr != null){
	        if(isLeaf(curr) == false) temp.push(curr.data);
	        if(curr.right != null) curr = curr.right;
	        else curr = curr.left;
    }
	        while(!temp.isEmpty()){
	            res.add(temp.pop());
	        }
  }
}
