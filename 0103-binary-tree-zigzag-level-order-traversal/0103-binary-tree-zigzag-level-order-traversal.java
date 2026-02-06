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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);
        int levelcount=1;
        while(!q.isEmpty()){
            int count=q.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr= q.poll();
                level.add(curr.val);
                
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
                if(levelcount%2==0){
                    Collections.reverse(level);
                }
                 levelcount++;
             ans.add(level);
            }
           return ans;     
        }
       
    }