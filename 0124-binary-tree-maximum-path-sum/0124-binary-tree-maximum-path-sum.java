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
      int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
      
        //base case if we reach the leaf node
    /*    if(root==null ) {
            return 0;
        }
        if(root.left==null && root.right==null){
            maxsum=Math.max(maxsum,root.val);
            return root.val;
        }
       
            int leftsum=maxPathSum(root.left);
            int rightsum=maxPathSum(root.right);
            maxsum=Math.max(maxsum,(root.val+leftsum+rightsum));
             root.val= root.val+Math.max(leftsum,rightsum);
        
        return maxsum;*/

        dfs(root);
        return maxsum;
    }
    private int dfs(TreeNode root){
        if(root==null)return 0;

        int leftsum=Math.max(0,dfs(root.left));
        int rightsum=Math.max(0,dfs(root.right));

        maxsum=Math.max(maxsum,root.val+leftsum+rightsum);

        return root.val+Math.max(leftsum,rightsum);
    }
}