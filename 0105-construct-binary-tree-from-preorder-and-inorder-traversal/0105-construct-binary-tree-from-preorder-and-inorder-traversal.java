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
    int preidx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return(build( preorder,inorder,0,inorder.length-1));
    }
     public TreeNode build(int[] preorder, int[] inorder,int instart,int inend) {
        //base case
        if(instart>inend){
            return null;
        }
        TreeNode root= new TreeNode(preorder[preidx]);
        preidx++;
        int rootidx=instart;
        for(int i=instart;i<=inend;i++){
            if(inorder[i]==root.val){
                rootidx=i;
                break;
            }
        }
        root.left=build(preorder,inorder,instart,rootidx-1);
        root.right=build(preorder,inorder,rootidx+1,inend);

        return root;
    }

}