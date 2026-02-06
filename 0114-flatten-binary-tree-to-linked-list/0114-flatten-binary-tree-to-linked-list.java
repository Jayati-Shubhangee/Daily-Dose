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
    //TreeNode nextright=null;
    public void flatten(TreeNode root) {
      /*  if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        //updating links
        root.left=null;
        root.right=nextright;
        nextright=root;*/
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {

                TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }

                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;

    }
}
}