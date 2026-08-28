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
    public TreeNode searchBST(TreeNode root, int val) {
        return result(root, val);
    }

    private TreeNode result(TreeNode InRoot, int InVal){
        if(InRoot == null || InRoot.val == InVal)
        return InRoot;

        if(InVal < InRoot.val) return result(InRoot.left, InVal);
        else return result(InRoot.right, InVal);
    }
}