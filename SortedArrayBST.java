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
class SortedArrayBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return innerBSTGenerator(0,nums.length - 1, nums);
    }
    
    private TreeNode innerBSTGenerator(int start, int end, int[] nums) {
        if(start>end)
            return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = innerBSTGenerator(start, mid-1, nums);
        node.right = innerBSTGenerator(mid+1, end, nums);
        return node;
    } 
}