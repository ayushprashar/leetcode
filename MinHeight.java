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
class MinHeight {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int leftHeight = 0;
        if(root.left == null)
            leftHeight = 100000;
        else
            leftHeight = minDepth(root.left);
        int rightHeight = 0;
        if(root.right == null)
            rightHeight = 100000;
        else
            rightHeight = minDepth(root.right);
        return Math.min(leftHeight, rightHeight) + 1;
    }
}