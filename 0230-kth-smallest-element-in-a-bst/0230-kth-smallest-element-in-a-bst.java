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
    public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> ans = new ArrayList<>();
       dfs(root,ans,k) ;
      return ans.get(k-1);
    }
    public void dfs(TreeNode root, ArrayList ans,int k){
        
        if(root==null){
            return ;
        }
       /* if(root.left==null && root.right==null){
            ans.add(root.val);
            return 0 ;
        }*/
        dfs(root.left,ans,k);
        ans.add(root.val);
        dfs(root.right,ans,k);
  
  
 
        
    }

}