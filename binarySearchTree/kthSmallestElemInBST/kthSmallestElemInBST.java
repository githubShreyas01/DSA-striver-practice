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
    int cnt = 0;
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = new int[1];
        inorder(root, k, ans);
        return ans[0];
    }
    public void inorder(TreeNode root, int k, int[] ans){
        if(root == null) return;
        inorder(root.left, k, ans);
        cnt++;
        if(cnt == k){
            ans[0] = root.val;
            return;
        }
        inorder(root.right, k, ans);

    }
}
