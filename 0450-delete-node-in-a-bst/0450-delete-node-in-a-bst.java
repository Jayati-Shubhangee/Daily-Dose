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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key < root.val){
root.left= deleteNode(root.left,key);
        }
        else if(key > root.val){
            root.right= deleteNode(root.right,key);
        }
        else{
            if(root.left == null && root.right==null){
                root=null;
                return null;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }
            else if(root.left==null) return root.right;

            else if(root.left!= null && root.right!= null){
                TreeNode is= IS(root.right);
                root.val=is.val;
              root.right=  deleteNode(root.right,is.val);
            }

        }
        return root;
    }
    public TreeNode IS(TreeNode root){
       // if(root==null) return root;
        if(root.left==null){
           return root;
        }
        else{
         return  IS(root.left);
        }
    }
}