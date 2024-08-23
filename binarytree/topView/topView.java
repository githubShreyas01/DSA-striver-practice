// } Driver Code Ends
// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Pair{
    Node node;
    int hd;
    Pair(Node node, int hd){
        this.node =node;
        this.hd = hd;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair> qu = new LinkedList<>();
        
        qu.add(new Pair(root, 0));
        
        while(!qu.isEmpty()){
            Pair p = qu.remove();
            int hd = p.hd;
            Node temp = p.node;
            
            if(mpp.get(hd) == null) mpp.put(hd, temp.data);
            
            if(temp.left != null){
                qu.add(new Pair(temp.left, hd-1));
            }
            if(temp.right != null){
                qu.add(new Pair(temp.right, hd +1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
