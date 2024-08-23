// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Node> qu = new LinkedList<Node>();
        
        root.hd = 0;
        qu.add(root);
        
        while(!qu.isEmpty()){
            Node temp = qu.remove();
            int hd = temp.hd;
            mpp.put(hd, temp.data);
            
            if(temp.left != null){
                temp.left.hd = hd-1;
                qu.add(temp.left);
            }
            
            if(temp.right != null){
                temp.right.hd = hd+1;
                qu.add(temp.right);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            res.add(entry.getValue());
        }
        
        return res;
    }
}
