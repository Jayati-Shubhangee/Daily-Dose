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
    public List<String> binaryTreePaths(TreeNode root) {
       ArrayList<String> ans= new ArrayList<>() ;

//base case
if(root == null){
    return ans;
}
    //check on leafnodes
    if(root.left == null && root.right==null){
        ans.add(Integer.toString(root.val));//meaning its end node leaf node of our path 
    }
       //recursive call faith on left subtree path 
       List<String> left= binaryTreePaths(root.left);
       for(String path: left){
        ans.add(root.val+"->"+path);
       }
       List<String> right= binaryTreePaths(root.right);
       //and faith on right subtree path 
        for(String path: right){
        ans.add(root.val+"->"+path);
       }
       return ans;
    }
}
