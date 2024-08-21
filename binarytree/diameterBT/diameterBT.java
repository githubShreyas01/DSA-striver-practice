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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] arr = new int[1];
        arr[0] = 0;
        diameter(root, arr);
        return arr[0];
    }


    public int diameter(TreeNode root, int [] arr){
        if(root == null) return 0;
        int[] lh = new int[1];
        lh[0] = diameter(root.left, arr);
        int[] rh = new int[1];
        rh[0] = diameter(root.right, arr);
        
        
        arr[0] = Math.max(arr[0], lh[0] + rh[0]);

        return (1 + Math.max(lh[0], rh[0]));
    }
}
