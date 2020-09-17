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
class BinaryLOT {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        levelTravel(root, 0, list);
        Collections.reverse(list);
        return list;
    }
    
    private void levelTravel(TreeNode root,int level, List<List<Integer>> list) {
        if(level == list.size()) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        if(root.left!=null)
            levelTravel(root.left, level + 1, list);
        if(root.right != null)
            levelTravel(root.right, level + 1, list);
    }
    
    
}
/*class BinaryLOT {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        int height = height(root);
        
        for(int i = 0; i < height; i++) {
            list.add(new ArrayList<>());
        }
        
        for(int i = 0; i < height; i++)
            levelTravel(i, height - 1, list.get(i), root);
        
        return list;
    }
    
    private void levelTravel(int i, int level,List<Integer> list,TreeNode root) {
        if(root != null) {
            if(i - level == 0) {
                list.add(root.val);
                return;
            } else {
                levelTravel(i, level - 1,list, root.left);
                levelTravel(i, level - 1,list, root.right);
            }
            
        }
    }
    
    private int height(TreeNode root) {
        if(root == null)
            return 0;
        else return 1 + Math.max(height(root.right), height(root.left));
    }
}*/