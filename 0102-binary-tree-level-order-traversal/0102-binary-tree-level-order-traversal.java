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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        //making a queue
        if(root==null) return result;
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        while(mq.size()>0){
            int count=mq.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<count;i++){
                root=mq.poll();
                level.add(root.val);
                if(root.left!=null){
                    mq.add(root.left);
                }
                if(root.right!=null){
                    mq.add(root.right);
                }
                
            }
            result.add(level);
        }


return result;
    }
}