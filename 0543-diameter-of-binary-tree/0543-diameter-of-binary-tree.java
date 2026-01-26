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
    int maxdia=0;
    public int diameterOfBinaryTree(TreeNode root) {
       /* int maxdia=0;
        if(root==null){
            return 0;
        }
        int leftheight=diameterOfBinaryTree(root.left);
        int rightheight=diameterOfBinaryTree(root.right);
        return (Math.max(maxdia,leftheight+rightheight));*/
        height(root);
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

        return Math.max(leftheight, rightheight) + 1;
    }
}