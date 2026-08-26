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
    public int maxDepth(TreeNode root) {
        return result(root);
    }

    private static int result(TreeNode InRoot){
        if(InRoot == null) return 0;

        int leftNode = result(InRoot.left);
        int rightNode = result(InRoot.right);

        return Math.max(leftNode, rightNode) + 1;
    }
}