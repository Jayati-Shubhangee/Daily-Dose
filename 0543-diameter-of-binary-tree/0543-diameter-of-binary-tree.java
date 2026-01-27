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
   // int maxdia=0;
    private static int height(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return(Math.max(left,right)+1);
        }
    public int diameterOfBinaryTree(TreeNode root) {
      
       /* height(root);
        return maxdia;   // diameter in EDGES
    }

    private int height(TreeNode root) {

        if (root == null) {
            return 0;    // node-based height
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        // convert nodes → edges here
        maxdia = Math.max(maxdia, leftheight + rightheight);

        return Math.max(leftheight, rightheight) + 1;*/
      
        if(root==null){
            return 0;
        }
        int leftdia=diameterOfBinaryTree(root.left);
        int rightdia=diameterOfBinaryTree(root.right);
        int currdia=height(root.left)+height(root.right);
        return(Math.max(currdia, Math.max(leftdia,rightdia)));
    }
}