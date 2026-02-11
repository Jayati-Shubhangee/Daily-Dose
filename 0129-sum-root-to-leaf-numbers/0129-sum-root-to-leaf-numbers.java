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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        return sum;
    }
    public void dfs(TreeNode root, StringBuilder sb){
        if(root==null){
            return ;
        }
         sb.append(root.val);
        if(root.left==null && root.right==null){
             sum+=Integer.parseInt(sb.toString());
        }
        else{
            dfs(root.left,sb);
            dfs(root.right,sb);
        }
//bactracking step 
        sb.deleteCharAt(sb.length()-1);
    }
    
}