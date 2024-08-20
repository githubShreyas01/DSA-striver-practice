/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wrap_res = new ArrayList<>();
        
        Queue<TreeNode> qu = new LinkedList<>();

        if(root == null) return wrap_res;
        qu.offer(root);
        while(!qu.isEmpty() ){
            int levelNum = qu.size();
            List<Integer> res = new ArrayList<>();
            for(int i =0;i<levelNum;i++){
                if(qu.peek().left != null) qu.offer(qu.peek().left);
                if(qu.peek().right != null) qu.offer(qu.peek().right);
                res.add(qu.poll().val);
            }
            wrap_res.add(res);
        }
        return wrap_res;           
    }
}
