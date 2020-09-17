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
class MaxDepthBT {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else {
            int rightHeight = 0;
            if(root.right != null)
                rightHeight = maxDepth(root.right);
            int leftHeight = 0;
            if(root.left != null)
                leftHeight = maxDepth(root.left);
            return Math.max(leftHeight, rightHeight) + 1; 
            
        }
            //return Integer.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}