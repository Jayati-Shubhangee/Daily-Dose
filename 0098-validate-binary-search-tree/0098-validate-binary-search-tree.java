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
    ArrayList<Integer> list= new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
       /* boolean ans = dfs(root);
        return ans;
    }
    public boolean dfs(TreeNode root){
        if(root==null) return true;

         else if(root.left==null && root.right ==null){
            return true;
        }
        else if(root.left == null && root.right!=null){
            if(root.right.val > root.val){
                return true;

            }
            else{
                return false;
            }
        }
        else if(root.right == null && root.left!=null){
            if(root.left.val < root.val){
                return true;

            }
            else{
                return false;
            }
        }
        else if(root.left.val >= root.val || root.right.val <= root.val){
            return false;
        }
       /* else{
            return true;
        }
         else if(root.left.val < root.val && root.right.val > root.val){
            return true;
        }

        boolean left = dfs(root.left);
        boolean right= dfs(root.right);

        if(left == false || right==false){
            return false;
        }
return true;*/
 inorder(root);
 boolean res=check(list);
 return res;

    }
    public void inorder(TreeNode root){
        
        if(root==null){
            return ;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        //check here only if inorder list find out is sorted or not 
     
    }
    public boolean check(ArrayList<Integer> list){
          boolean ans=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
ans=false;
            }
        }
        return ans;
    }
}