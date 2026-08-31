import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        return result(root);
    }

    private List<List<Integer>> result(TreeNode InRoot){
        List<List<Integer>> answer = new ArrayList<>();

        if(InRoot == null) return answer;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(InRoot);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            answer.add(currentLevel);
        }
        return answer;
    }
}