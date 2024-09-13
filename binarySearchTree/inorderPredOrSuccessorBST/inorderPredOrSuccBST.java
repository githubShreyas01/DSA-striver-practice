// } Driver Code Ends


class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        pre[0] = inorderPre(root, key);
        suc[0] = inorderSuc(root, key);
    }
    public static Node inorderPre(Node root, int key ){
            Node pre = null;
            while(root != null){
               if(root.data >= key){
                root = root.left;
                }
                else{
                pre = root;
                root = root.right;
                } 
            }
            return pre;
    }
    public static Node inorderSuc(Node root, int key){
            Node suc = null;
            while(root != null){
                if(root.data <= key){
                root = root.right;
                }
                else{
                suc = root;
                root = root.left;
                }  
            }
            return suc;
    }
}
