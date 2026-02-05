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
    class Pair{
        TreeNode root;
        int idx;
        Pair(TreeNode root, int idx){
            this.root=root;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q= new ArrayDeque<>();
q.add(new Pair(root,0));
int maxwidth=Integer.MIN_VALUE;
while(!q.isEmpty()){
    int size=q.size();
    int sidx=q.peek().idx;
    int eidx=sidx;
    maxwidth=Math.max(maxwidth,sidx-eidx+1);
    for(int i=0;i<size;i++){
        Pair currnode =q.poll();
        eidx=currnode.idx;
if(currnode.root.left!=null){
   q.add(new Pair(currnode.root.left, 2*currnode.idx));

}
if(currnode.root.right!=null){
    q.add(new Pair(currnode.root.right, 2*currnode.idx+1));
    
}
    }
    maxwidth=Math.max(maxwidth,(int)(eidx-sidx+1));

}
return maxwidth;
    }
}