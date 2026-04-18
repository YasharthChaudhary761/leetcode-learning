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
    private int maximumDiameter;
    public int diameterOfBinaryTree(TreeNode root) {
        maximumDiameter=0;
        computeHeight(root);
        return maximumDiameter;
    }
    public int computeHeight(TreeNode root){
        if(root == null) return  0;
        int lh = computeHeight(root.left);
        int rh = computeHeight(root.right);
        maximumDiameter = Math.max(maximumDiameter, lh+rh);
        return 1+ Math.max(lh,rh);
    
    }
}