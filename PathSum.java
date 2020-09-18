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
class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        else
            return hasPathSumInner(root, sum);
        
    }
    
    private boolean hasPathSumInner(TreeNode root, int sum) {
        if(root == null && sum == 0)
            return true;
        else if(root == null)
            return false;
        boolean leftStatus;
        
        if(root.left == null && root.right != null)
            leftStatus = false;
        else
            leftStatus = hasPathSumInner(root.left, sum - root.val);
        boolean rightStatus;
        if(root.right == null && root.left != null)
            rightStatus = false;
        else
            rightStatus = hasPathSumInner(root.right, sum - root.val);
        
        return leftStatus ||  rightStatus;
        
    }
}