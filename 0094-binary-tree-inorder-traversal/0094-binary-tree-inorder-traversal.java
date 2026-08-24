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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return result(root);
    }

    private static List<Integer> result(TreeNode InRoot){
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = InRoot;

        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            answer.add(current.val);

            current = current.right;
        }

        return answer;
    }
}