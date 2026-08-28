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
    public boolean isValidBST(TreeNode root) {
        return result(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean result(TreeNode InNode, long InMin, long InMax){
        if(InNode == null) return true;

        if(InNode.val <= InMin || InNode.val >= InMax) return false;

        return result(InNode.left, InMin, InNode.val) && result(InNode.right, InNode.val, InMax);
    }
}